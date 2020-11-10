package p31;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author albertolopez
 */
public class Contagios {

    public static final String[] NOMBRECIUDAD = {"Estepona", "Marbella", "Mijas", "Fuengirola", "Benalmádena", "Torremolinos"};
    public static final String[] NOMBRECENTRO = {"Norte", "Sur", "Este", "Oeste"};
    public static int[] contagio;
    public static int ciudad, centro, rastreador;

    public static void main(String[] args) {

        do {
            generaDistrito();
            solicitaDatos();
            informeGeneral();
        } while (menuRepite());
    }

    public static void generaDistrito() {
        Random random = new Random();

        ciudad = random.nextInt(4) + 3;
        centro = random.nextInt(3) + 2;

        rastreador = random.nextInt(5) + 1;
        contagio = new int[ciudad];

        System.out.print("El Distrito de la Costa del Sol esta compuesto por " + ciudad + " ciudades: ");
        for (int i = 0; i < ciudad; i++) {
            System.out.print(NOMBRECIUDAD[i] + " | ");
        }
        System.out.print("Cada una de ellas con " + centro + " centros de salud y " + rastreador + " rastreadores.");
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
    }

    public static void solicitaDatos() {
        Scanner sc = new Scanner(System.in);
        int cantidad;
        boolean ok;

        for (int i = 0; i < ciudad; i++) {
            for (int j = 0; j < centro; j++) {
                for (int k = 1; k <= rastreador; k++) {
                    do {
                        System.out.println(
                                "Introduce contagios del rastreador " + k + " del centro de salud " + NOMBRECENTRO[j] + " en " + NOMBRECIUDAD[i] + ".");

                        cantidad = sc.nextInt();
                        if (cantidad < 0 || cantidad > 500) {
                            ok = false;
                            System.out.println("La cantidad de contagios introducida no es correcta, debe estar entre 0 y 500.");
                        } else {
                            ok = true;
                            contagio[i] += cantidad;
                        }
                    } while (!ok);
                }
            }
        }
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
    }

    public static void informeGeneral() {
        System.out.println("El total de contagiados por ciudad es el siguiente:");
        for (int i = 0; i < ciudad; i++) {
            System.out.println("- " + NOMBRECIUDAD[i] + ": " + contagio[i] + " contagiados.");
        }
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");
    }

    public static boolean menuRepite() {
        Scanner sc = new Scanner(System.in);
        String texto;
        char eleccion;

        while (true) {
            System.out.println("¿Quiere repetir la simulación? S/N");
            texto = sc.nextLine();
            eleccion = texto.charAt(0);

            System.out.println("");
            System.out.println("-------------------------------------------------");
            System.out.println("");

            if (eleccion == 'S' || eleccion == 's') {
                return true;
            } else if (eleccion == 'N' || eleccion == 'n') {
                return false;
            }
        }
    }
}
