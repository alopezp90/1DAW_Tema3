/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primos;

/**
 *
 * @author albertolopez
 */
import javax.swing.JOptionPane;

public class Primos {
    public static void main(String[] args) {
     
        int x, divisor=0, i;
        boolean primo=true;
        String texto;
        
        do {
            texto = JOptionPane.showInputDialog("introduce un entero mayor que uno.");
            x=Integer.parseInt(texto);
        } while (x<=1);
        
        i=(int)Math.sqrt(x);

        while (i>1) {
            if (x%i==0){
                divisor=i;
                primo=false;
                break;
            }
            i--;
        }
        if (primo) {
            JOptionPane.showMessageDialog(null, "El número "+x+" es primo.");
        } else {
            JOptionPane.showMessageDialog(null, "El número "+x+" no es primo\n"
                    + "y un divisor es "+divisor);
        }
        
    }
}
