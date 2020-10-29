/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3saltos;

/**
 *
 * @author alberto
 */
import java.util.Scanner;

public class EjemplosSaltos {

    public static void main(String[] args) {

        int x, j;
        double media;
        final int MULTIPLO = 3, LIMITE = 100;
        final String PALABRA1 = "daw", PALABRA2 = "primero";
        String texto;

        Scanner sc = new Scanner(System.in);

        //a) Mostrar números entre 1 y 100, sin mostrar los múltiplos de 3
        for (int i = 1; i <= LIMITE; i++) {
            if (i % MULTIPLO == 0) {
                continue;
            }
            System.out.print(i + " - ");
        }

        System.out.println("----------------------------------------------------");
        //b) Leer palabras por teclado y mostrarlas en consola hasta que el usuario introduzca la palabra "daw" o "primero"
        System.out.println("Introduce daw o primero");
        do {
            texto = sc.nextLine();
            System.out.println("Has escrito: " + texto);
            if (texto.equals(PALABRA1)) {
                break;
            }
        } while (!texto.equals(PALABRA2));

        System.out.println("----------------------------------------------------");
        //c) Leer una serie de números por teclado y hacer la media aritmética. El programa termina de leer cuando el usuario introduce un cero
        System.out.println("Introduce los números a los que quieras hacer media. Introduce 0 para acabar");
        media = 0;
        j = 0;

        while (true) {
            x = sc.nextInt();
            if (x == 0) {
                break;
            }
            media += x;
            j++;
        }

        if (j == 0) {
        } else {
            media /= j;
        }
        System.out.printf("\nLa media aritmética es: %.2f", media);
    }
}
