/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Egg;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String nombre;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        
        nombre = leer.nextLine();
                
        System.out.println("Hola mundo, soy " + nombre + " y este es mi primer programa en JAVA!");
        
    }
    
}
