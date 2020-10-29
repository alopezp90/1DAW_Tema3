/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2seleccion;

/**
 *
 * @author alberto
 */
import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        
        System.out.println("Introduce edad:");
        Scanner scanner = new Scanner(System.in);

        int edad = scanner.nextInt();

        String texto = (edad>=18)? "Es mayor de edad":"No es mayor de edad";
        System.out.println(texto);
        
    }
}
