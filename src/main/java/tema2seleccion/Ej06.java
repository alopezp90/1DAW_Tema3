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

public class Ej06 {
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);
        int opcion;
        double side1,side2,area;
        final double PI=3.14;
        
        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");
 
        System.out.print("Elija una opción: ");
        opcion = entrada.nextInt();
 
        if (opcion == 1) {
            System.out.println("Ha seleccionado calcular el área de un cuadrado...");
            System.out.println("\nIndique lado del cuadrado");
            side1 = entrada.nextDouble();
            area = Math.pow(side1, 2);
            System.out.println("El área es de "+area+" unidades cuadradas");
            
        } else if (opcion == 2) {
            System.out.println("Ha seleccionado calcular el área de un triángulo...");
            System.out.println("\nIndique base del triángulo");
            side1 = entrada.nextDouble();
            System.out.println("Indique altura del triángulo");
            side2 = entrada.nextDouble();
            area=side1*side2/2;
            System.out.println("El área es de "+area+" unidades cuadradas");
            
        } else if (opcion == 3) {            
            System.out.println("Ha seleccionado calcular el área de un círculo...");
            System.out.println("\nIndique radio del círculo.");
            side1 = entrada.nextDouble();
            area=2*side1*PI;
            System.out.println("El área es de "+area+" unidades cuadradas");
            
        } else {
            System.out.println("Ha seleccionado terminar");
        }     
    }
}
