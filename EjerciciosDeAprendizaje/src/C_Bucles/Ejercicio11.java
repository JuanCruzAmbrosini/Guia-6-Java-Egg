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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Realizar un programa que pida dos números enteros positivos por teclado y muestre por
            pantalla el siguiente menú:

            El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
            y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
            Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
            directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
            desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
            programa, caso contrario se vuelve a mostrar el menú. */

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num1 = leer.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = leer.nextInt();

        String cont = "y";

        while (cont.equalsIgnoreCase("y")) {

            System.out.println("Menú");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir ");
            System.out.println("5. Salir ");
            System.out.println("Elija la opción deseada: ");

            int opcion = leer.nextInt();

            switch (opcion) {

                case 1:

                    int suma = num1 + num2;
                    System.out.println("La suma de los 2 números es de: " + suma);
                    break;

                case 2:

                    int resta = num1 - num2;
                    System.out.println("La resta de los 2 números es de: " + resta);
                    break;

                case 3:

                    int multi = num1 * num2;
                    System.out.println("La multiplicación de los 2 números es de: " + multi);
                    break;

                case 4:

                    double divid = (double) num1 / num2;
                    System.out.println("La división de los 2 números es de: " + divid);
                    break;

                case 5:

                    System.out.println("¿Desea continuar? (y/n) ");
                    cont = leer.next();

                default:

                    System.out.println("Ingrese un valor válido.");

            }

        }

    }

}
