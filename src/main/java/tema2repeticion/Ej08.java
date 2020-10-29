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
public class Ej08 {
    public static void main(String[] args) {
        int j = 1;
        for (int i = -13; i <= -10; i++) {
            j++;
        }
        System.out.println(j);
    }
}
//Le suma a la valiable j (inicializada j=1) 1 cada vez que se repite el bucle
//for, es decir, cuenta las veces que hay que sumar 1 a -13 hasta que sea igual 
//a -10 (3 veces+1 inicial) es decir, que al final de la ejecucion, j vale 5