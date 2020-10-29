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
public class Ej04 {
    public static void main(String[] args) {
        
        int numero = 1;

        while (numero < 11) {
            System.out.println("Número: " + numero);
            numero++;
        }
        do {
            System.out.println("Número: " + --numero);
        } while (numero > 1);
    }
}
//El programa imprime el valor de un numero (comenzando por 1), luego suma uno
//y sigue imprimiendo hasta que llega a imprimir 10 (valor 11), para luego imprimir
//el valor restandole 1 cada vez hasta llegar a 1 de nuevo