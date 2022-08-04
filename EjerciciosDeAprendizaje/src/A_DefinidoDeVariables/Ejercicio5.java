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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Escribir un programa que lea un número entero por teclado y muestre por pantalla el
            doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt(). */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero: ");
        int num = leer.nextInt();
        
         int dobleNum = num * 2;
         System.out.println("El doble del número ingresado es: " + dobleNum);
        
        int tripleNum = num * 3;
        System.out.println("El triple del número ingresado es: " + tripleNum);
        
        float raizCuadrada = (float) Math.sqrt(num);
        System.out.println("La raíz cuadrada del número ingresado es: " + raizCuadrada);
        
        
    }
    
}
