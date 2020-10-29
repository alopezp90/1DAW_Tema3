/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceituneros;

/**
 *
 * @author alberto
 */
import java.util.Scanner;

public class Aceituneros {
     public static void main(String[] args) {
          
        double peso,ganancia,modificador=0;
        int opcion,tipo;
        final double TASA=1.23;
               
        Scanner sc = new Scanner(System.in);
        

        System.out.println("SELECCIONE TIPO DE ACEITUNA");
        System.out.println("---------------------------");
        System.out.println("1.Picual");
        System.out.println("2.Aloreña");
        System.out.println("3.Hojiblanca");
        System.out.println("CUALQUIER OTRO PARA SALIR");            
        System.out.println("---------------------------");

        opcion = sc.nextInt();

        if (opcion==1 || opcion==2 || opcion==3){ //Solo si selecciona opcion
            do{
                System.out.println("SELECCIONE TAMAÑO");
                System.out.println("-----------------");
                System.out.println("1.Fina");
                System.out.println("2. Gruesa");
                tipo = sc.nextInt();
            } while (tipo!=1 && tipo!=2); //Mantiene el bucle si se introduce otro valor

            System.out.println("Introduzca cantidad de producto (kg).");
            peso=sc.nextDouble();

            switch (opcion){
                case 1:
                    modificador = (tipo==1)?0.03:0.20;//Picual
                    break;
                case 2:
                    modificador = (tipo==1)?-0.3:-0.15;//Aloreña
                    break;
                case 3:
                    modificador = (tipo==1)?-0.05:0.15;//Hojiblanca
                    break;
            }

            ganancia=peso*(TASA+modificador);

            System.out.printf("La ganancia por %.2f kilos es de %.2f €.",peso,ganancia);
        }

    }
}
