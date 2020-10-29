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

public class Ej02 {
    public static void main(String[] args) {
        
        int x,absoluto;
        final int LIMITE = 135;
        String resultado;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce número");
        x= sc.nextInt();
        
        resultado = (x>=LIMITE)? "mayor que "+LIMITE : "menor que "+LIMITE;
        System.out.println(resultado);

        resultado = (x>=0)? "Mayor que cero": "Menor que cero";
        System.out.println(resultado);
        
        absoluto = (x>=0)? x : -x;
        System.out.println("El valor absoluto es: "+absoluto);
    }
}