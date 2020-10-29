/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2repeticion;

/**
 *
 * @author alberto
 */
import java.util.Scanner;
public class Ej02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, x;
        System.out.print("Ingrese el valor final:");
        n = teclado.nextInt();
        x = 1;
        while (x <= n) {
            System.out.print(x);
            System.out.print(" - ");
            x = x + 1;
        }
    }
}
//El prograna solicita un valor entero, para posteriormente entrar en un bucle 
//que imprime un valor x, que comnzando por uno, llega hasta el valor introducido 
//por el usuario. El resultado es un listado de numeros desde 1 hasta n en la pantalla