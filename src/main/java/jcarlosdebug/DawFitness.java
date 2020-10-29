package jcarlosdebug;

import javax.swing.JOptionPane;

// BREAKPOINTS
public class DawFitness {

    public static void main(String[] args) {

        /*
            El programa da tres opciones
            1.- Calcular IMC
            2.- Calcular kcal consumidas
            3.- Salir
            La opción se lee con JOption.
            Cuando se acabe una opción se debe repetir
            el programa, a menos que se quiera salir
         */
        int opcionElegida, opcionDeporte, caloria = 0;
        boolean repetir = true; // Para saber si tengo que repetir
        // todo el programa 
        String texto;
        double peso = 0, estatura = 0, indice = 0, tiempo = 0, quemado = 0;
        String resultado;
        final int CAL_ANDAR = 500, CAL_CORRER = 740, CAL_NADAR = 800;

        do {

            // El siguiente do-while permite filtrar la entrada del user
            // de forma que si se equivoca se le vuelve a pedir el dato
            do {

                String opcion = JOptionPane.showInputDialog("Opciones del programa\n"
                        + "1.- Calcular IMC\n"
                        + "2.- Calcular Kcal consumidas\n"
                        + "3.- Salir");

                opcionElegida = Integer.parseInt(opcion);

            } while (opcionElegida < 1 || opcionElegida > 3);

            // Esta línea sirve para depurar
            // System.out.println("La opcion elegida es " + opcionElegida);
            // En función de la opción haremos unas cosas u otras
            switch (opcionElegida) {
                case 1:
                    do {
                        texto = JOptionPane.showInputDialog("Introduce tu peso (kg)");
                        peso = Double.parseDouble(texto);
                    } while (peso < 20 || peso > 300);

                    do {
                        texto = JOptionPane.showInputDialog("Introduce estatura (m)");
                        estatura = Double.parseDouble(texto);
                    } while (estatura < 1 || estatura > 2.5);

                    indice = peso / Math.pow(estatura, 2);

                    if (indice < 18.5) {
                        resultado = "peso inferior al normal.";
                    } else if (indice < 24.5) {
                        resultado = "peso normal.";
                    } else if (indice < 30) {
                        resultado = "sobrepeso.";
                    } else {
                        resultado = "obesidad.";
                    }

                    JOptionPane.showMessageDialog(null, String.format("Tiene un índice de masa corporal de %.2f.\n"
                            + "Según las tablas tiene " + resultado, indice));
                    // Calcular IMC
                    //System.out.println("Calcula el IMC"); // Depuración
                    break;
                case 2:
                    do {
                        opcionDeporte = JOptionPane.showOptionDialog(null,
                                "Selecciona tu ejercicio",
                                "Elige",
                                JOptionPane.YES_NO_CANCEL_OPTION,
                                JOptionPane.QUESTION_MESSAGE,
                                null,
                                new Object[]{
                                    "Andar", "Correr", "Nadar"}, null);
                    } while (opcionDeporte != 0 && opcionDeporte != 1 && opcionDeporte != 2);

                    switch (opcionDeporte) {
                        case 0:
                            caloria = CAL_ANDAR;
                            break;

                        case 1:
                            caloria = CAL_CORRER;
                            break;

                        case 2:
                            caloria = CAL_NADAR;
                            break;
                    }

                    do {
                        texto = JOptionPane.showInputDialog("¿Cuánto tiempo haces ejercicio (h)");
                        tiempo = Double.parseDouble(texto);
                    } while (tiempo < 0 || tiempo > 5);

                    quemado = caloria * tiempo;

                    JOptionPane.showMessageDialog(null, String.format("Consumes %.0f kcal", quemado));

                    //System.out.println("Calcula kcal"); // Depuración
                    // Calcular Kcal
                    break;
                case 3:
                    //System.out.println("Salir"); // Depuración
                    // Preguntar si quiere salir
                    // Usamos un JOptionPane.showConfirmDialog
                    // Devuelve un entero: 0 o 1 en función de si se pulsa
                    // YES o NO.
                    int op = JOptionPane.showConfirmDialog(null,
                            "¿Deseas salir?", "Salida del programa", JOptionPane.YES_NO_OPTION);

                    // System.out.println("Opcion: " + op); // Depuración
                    if (op == JOptionPane.YES_OPTION) {
                        // Quiere salir
                        System.out.println("Saliendo...."); // Depuración
                        repetir = false; // Condición de parada del programa

                    }
                    break;

            }

        } while (repetir);  // Este bucle permite repetir todo
        // hasta que se produzca la condición
        // de salida y entonces repetir es false
    }

}
