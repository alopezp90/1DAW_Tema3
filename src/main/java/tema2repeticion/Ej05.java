/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2repeticion;

import java.util.Scanner;

/**
 *
 * @author alberto
 */
public class Ej05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;
        do {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        } while (x<=n);
    }
}
