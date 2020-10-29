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
public class Ej09 {
    public static void main(String[] args) {
        
        int variable=3, variable2;
        switch(variable)
        {
            case 1:
                variable2=5;
                break;
            case 2:
                variable2=20;
                break;
            case 3:
                variable2=30;
            case 4:
                variable2=10;
            default:
                variable2=100;
                break; 
        }
        //System.out.println(variable2);
    }
}
//Al final de la ejecucion la variable tiene valor 100, debido a que continua 
//ejecutando tras case 3, al no haber break
