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
public class Ej09 {
    public static void main(String[] args) {
        
        int i = 0;
        int j = 6;
        while (i < 0) {
            i++;
            j++;
        }
        
        System.out.println(j);
    }
}
//El programa suma 1 a j (inicializada j=6) cada vez que pueda sumar 1 a i 
//(inicializada i=0) y i cuampla que es menor que 0, es decir 0 veces, puesto 
//que nisiquiera la primera vez (sin sumar nada) cumple.Luego imprime j, es decir 6

