/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrevEjercicios;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class EjercicioI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
            bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
        resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
        Nota: recordar el uso de la sentencia break. */

        Scanner leer = new Scanner(System.in);

        int contador = 20;
        int suma = 0;

        while (contador > 0) {

            System.out.println("Ingreso N°" + contador + " (los números negativos no serán tomados en cuenta). Presione 0 para salir: ");
            int num = leer.nextInt();

            if (num > 0) {

                suma += num;

            }
            
            if ( num == 0 ){
                
                System.out.println("Se ha capturado el 0");
                break;
                
            }
            
            contador--;

        }
        
        System.out.println("La suma de los números positivos ingresados es de: " + suma );

    }
}