/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package C_Bucles;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio12 {

    /**
     * Realizar un programa que simule el funcionamiento de un dispositivo
     * RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
     * cadenas deben llegar con un formato fijo: tienen que ser de un máximo de
     * 5 caracteres de largo, el primer carácter tiene que ser X y el último
     * tiene que ser una O.
     *
     * Las secuencias leídas que respeten el formato se consideran correctas, la
     * secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
     * y toda secuencia distinta de FDE, que no respete el formato se considera
     * incorrecta.
     *
     * Al finalizar el proceso, se imprime un informe indicando la cantidad de
     * lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
     * deberá investigar cómo se utilizan las siguientes funciones de Java
     * Substring(), Length(), equals().
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String FDE;
        int contadorCorrecto = 0;
        int contadorIncorrecto = 0;

        System.out.println("Ingrese cadenas válidas ( de 5 carácteres, que comiencen con la X y finalicen con la O): ");
        System.out.println("Para salir del programa escriba &&&&&");

        do {

            System.out.println("Entrada de la cadena: ");
            FDE = leer.nextLine();

            if (FDE.length() == 5 && (FDE.substring(0, 1)).equalsIgnoreCase("X") && (FDE.substring(4, 5)).equalsIgnoreCase("O")) {

                System.out.println("Cadena válida!");
                contadorCorrecto++;

            } else if ("&&&&&".equals(FDE)) {

                System.out.println("Gracias por usar nuestros servicios.");

            } else {

                System.out.println("Cadena invalida!");
                contadorIncorrecto++;
                
            }
        } while (!"&&&&&".equals(FDE));

        System.out.println("La cantidad de cadenas válidas es de: " + contadorCorrecto);
        System.out.println("La cantidad de cadenas inválidas es de: " + contadorIncorrecto);
    }
}
