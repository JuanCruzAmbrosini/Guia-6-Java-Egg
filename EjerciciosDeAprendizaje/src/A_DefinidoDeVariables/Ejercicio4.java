/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A_DefinidoDeVariables;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
            Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)..*/
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de grados centígrados: ");
        float gradosCelcius = leer.nextFloat();
        
        float gradosFahrenheit = 32 + (9 * gradosCelcius / 5);
       
        System.out.println("El equivalente en grados Fahrenheit es: " + gradosFahrenheit);
        
    }
    
}
