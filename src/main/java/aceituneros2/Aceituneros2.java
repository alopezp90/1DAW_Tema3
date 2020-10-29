/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceituneros2;

import java.util.Scanner;

/**
 *
 * @author alberto
 */
public class Aceituneros2 {

    public static void main(String[] args) {

        double peso, ganancia, modificador = 0;
        int opcion, tipo;
        double tasa;
        boolean repite = true;
        final double PICUALF = 0.03, PICUALG = 0.2, ALORENAF = -0.3,
                ALORENAG = -0.15, HOJIBLANCAF = -0.05, HOJIBLANCAG = 0.15;

        Scanner sc = new Scanner(System.in);

        while (repite) {
            do {
                System.out.println("SELECCIONE TIPO DE ACEITUNA");
                System.out.println("---------------------------");
                System.out.println("1.Picual");
                System.out.println("2.Aloreña");
                System.out.println("3.Hojiblanca");
                System.out.println("4.Salir");
                System.out.println("---------------------------");
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 4);

            if (opcion == 4) {
                break;
            }

            do {
                System.out.println("SELECCIONE TAMAÑO");
                System.out.println("-----------------");
                System.out.println("1.Fina");
                System.out.println("2.Gruesa");
                tipo = sc.nextInt();
            } while (tipo != 1 && tipo != 2);

            do {
                System.out.println("Introduzca precio base por kilo (entre 1,20 y 5,15 €)");

                tasa = sc.nextDouble();
            } while (tasa < 1.20 || tasa > 5.15);

            do {
                System.out.println("Introduzca cantidad de producto (entre 100 y 2000 kg).");
                peso = sc.nextDouble();
            } while (peso < 100 || peso > 2000);

            switch (opcion) {
                case 1:
                    modificador = (tipo == 1) ? PICUALF : PICUALG;//Picual
                    break;
                case 2:
                    modificador = (tipo == 1) ? ALORENAF : ALORENAG;//Aloreña
                    break;
                case 3:
                    modificador = (tipo == 1) ? HOJIBLANCAF : HOJIBLANCAG;//Hojiblanca
                    break;
            }

            ganancia = peso * (tasa + modificador);

            System.out.printf("La ganancia por %.2f kilos es de %.2f €.", peso, ganancia);

            do {
                System.out.println("\n¿Quiere repetir?");
                System.out.println("-----------------");
                System.out.println("1.Repetir");
                System.out.println("2.Salir");
                opcion = sc.nextInt();
            } while (opcion < 1 || opcion > 2);

            if (opcion == 2) {
                repite = false;
            }

        }
    }
}
