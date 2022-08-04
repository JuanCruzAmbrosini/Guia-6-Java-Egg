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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        dos. El programa deberá después mostrar el resultado de la suma
        */
       
       Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer número a sumar: ");

        int num1 = leer.nextInt();
               
        System.out.println("Ingrese el segundo número a sumar: ");

        int num2 = leer.nextInt();

        int suma = num1 + num2;
        
        System.out.println("La suma entre " + num1 +" y " + num2 + " es: " + suma );
    }

}