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
public class FactorialFor {
    public static void main(String[] args) {
    
        Scanner sc= new Scanner(System.in);
        int factorial=1, n;
        
        System.out.println("Introduce número");
        n = sc.nextInt();
     
        for (int i=1; i<=n; i++){ //He puesto un bookmark/breakpoint y no se quitarlo
            factorial*=i;
        }
        System.out.println("El factorial de "+n+" es "+factorial);
    }
}
