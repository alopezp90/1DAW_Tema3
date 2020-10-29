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
public class Ej13 {
    public static void main(String[] args) {
        
        char x = 'A';
        
        do{
            System.out.println(x+" - "+ (int)x);
            x++;
        } while (x<='Z');
    }
    
}
