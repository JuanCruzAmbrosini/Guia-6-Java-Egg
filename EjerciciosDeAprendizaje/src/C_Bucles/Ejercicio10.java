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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
            números al usuario hasta que la suma de los números introducidos supere el límite inicial. */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor límite positivo: ");
        int valLimPos = leer.nextInt();
        
        int suma = 0;
        
        while (valLimPos > suma) {

            System.out.println("Ingrese un valor a sumar: ");
            int num = leer.nextInt();
            
            suma += num;
            
        }
        
        System.out.println("Se alcanzó el límite establecido.");
        
    }
    
}
