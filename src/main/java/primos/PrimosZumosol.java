package primos;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author alberto
 */
public class PrimosZumosol {

    public static void main(String[] args) {

        int numero, x;
        int i, j, opcion;
        String texto;
        int numR, numP, maxR;
        int primo[], raiz[];
        boolean primoBol[], repetir = true;

        do {
            texto = JOptionPane.showInputDialog("introduce un entero entre 1 y 100.000.000");
            numero = Integer.parseInt(texto);
        } while (numero < 1 || numero > Math.pow(10, 8));
        x = numero;

        //GENERA LISTADO DE PRIMOS DE 1 A N BASANDONOS EN LA CRIBA DE ERATOSTENES
        //Vamos a generar un listado de boolean de modo que primoBol[n] indicara si es primo el numero n
        //por lo tanto, el array primoBol[] deberá contar con x/2 redondeado hacia abajo elementos
        primoBol = new boolean[x + 1];
        Arrays.fill(primoBol, true);    //Inicializamos todos los impares como primo
        primoBol[0] = false;            //Quitamos primoBol[0] y primoBol [1]
        primoBol[1] = false;

        for (i = 2; i < x; i += 2) {    //Hace un barrido y quita los pares
            primoBol[i] = false;
        }
        for (i = 3; i <= x; i += 2) {              //Vamos haciendo sucesivos barridos por el array eliminando
            if (primoBol[i]) {                     //todos los mútiplos de los primos que vamos encontrando.
                for (j = 2; j * i <= x; j++) {
                    primoBol[j * i] = false;
                }
            }
        }
        //Ya tenemos un listado de boolean que podemos hacer corresponder con los primos de 1 a N.
        //Generamos otro array que almacene esos primos.

        numP = (int) (x);       //Aproximación de primos que puede haber por debajo de x,
        primo = new int[numP];  //anulado por errores cuando x es pequeño (se sale del array)
        primo[0] = 2;           //Añadimos 2 en el elemento [0] del array
        j = 1;

        for (i = 3; i <= x; i += 2) {
            if (primoBol[i]) {
                primo[j] = i;
                j++;
            }
        }
        //Ya tenemos un array con todos los primos menores que N, el resto del array está a 0.
        //Ahora generamos otro array que guarda el primo si es raiz de N.

        numR = (int) (Math.log(x) / Math.log(2));   //El número máximo de raices primas es el log en base 2 del número.
        raiz = new int[numR];
        maxR = (int) Math.sqrt(x);      //maxR seria el mas alto posible menor numero de los pares de raices de x.
        i = 0;
        j = 0;

        while (primo[i] <= maxR) {
            while (x % primo[i] == 0) { //Si la division es exacta anota el primo e intenta de nuevo el mismo.
                raiz[j] = primo[i];
                x /= primo[i];          //Actualizamos el cociente.
                j++;
                if (x == 1) {           //Si se encuentra última raíz prima, rompe el bucle.
                    break;
                }
            }
            maxR = (int) Math.sqrt(x);  //Actualiza la máxima raíz posible.
            i++;
        }
        if (x != 1) {
            raiz[j] = x;  //Si no hay mas raices menores que maxR, entonces el cociente ultimo es primo
        }
        do {
            do {
                opcion = JOptionPane.showOptionDialog(null,
                        "¿Que quieres imprimir en la consola?",
                        "Elige",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        new Object[]{
                            "Primos hasta N", "Factoriza N", "Salir"}, null);
            } while (opcion != 0 && opcion != 1 && opcion != 2 && opcion != -1);

            if (opcion == -1 || opcion == 2) {
                repetir = false;
            } else if (opcion == 0) {
                if (x > 100000) {
                    System.out.println("ESTAS MAL DE LA CABEZA, SALDRIAN MILES DE PRIMOS"
                            + "\nPRUEBA LA OTRA OPCION MEJOR O COMENTA L:103-106 y 115");
                } else {
                    System.out.println("Primos entre 1 y N:\n");
                    for (int k = 0; k < primo.length; k++) {
                        if (k != 0 && primo[k] != 0 && k % 50 == 0) {
                            System.out.println(primo[k] + "-");
                        } else if (primo[k] != 0) {
                            System.out.print(primo[k] + "-");
                        }
                    }
                }
                if (raiz[0] == 0) {
                    System.out.println("\n" + numero + " es PRIMO");
                }
            } else {
                System.out.println("\nRaices de N:\n");
                for (i = 0; i < raiz.length; i++) {
                    if (raiz[i] != 0) {
                        System.out.print(raiz[i] + " * ");
                    }
                }
            }
        } while (repetir);
    }
}
//        MEJORAS:
//        -------------------------------------
//        - Definir un mejor algorito para aproximar cantidad de primos para
//                  optimizar memoria (raices?)
//        - Mejorar la estética en la salida de datos:
//            1. Eliminar signos finales
//            2. Para números grandes, confirmar que quieres salida de datos o skip
//            3. Agrupar raices
//        - Hacer el programa recursivo:
//            1. Poder elegir otras opciones en ventana de seleccion sin reiniciar
//            2. Poder introducir otro numero sin reiniciar
//            3. Poder recalcular array de primos a partir del valor actual,
//                      o truncarlo cuando se introduce otro valor.
//            4. Guardar un listado de primos en un archivo y usarlo como array
//                      para comprobar primalidad: comprueba n (division por
//                      tentativa), escribe o no --> n+2
//                  a) Podria tener una pequeña rutina que compruebe las aproximaciones
//                          matematicas al numero de primos.
//                  b) Usar otros métodos para generar archivo:
//                          i)Criba de Atkin
//                          ii)Criba de Sundaram
//        -------------------------------------