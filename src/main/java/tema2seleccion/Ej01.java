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

public class Ej01 {
    public static void main(String[] args) {
        
        
        System.out.println("escanear edad:");
        Scanner scanner = new Scanner(System.in);

        int edad = scanner.nextInt();

        if (edad >= 18) {
                System.out.println("Es mayor de edad");
        } else {
                System.out.println("No es mayor de edad");
        }

        System.out.println("mostrar la edad: ");
        System.out.println(edad);
        
        //Introducimos los datos edad: 
        //12: No es mayor de edad
        //34: es mayor de edad
        //67: es mayor de edad
    }
    
}
