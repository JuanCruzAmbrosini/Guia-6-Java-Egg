/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package ejerciciosextra;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int contadorPares = 0;
        int contadorImpares = 0;
        int contadorTotal = 0;
        int num = 0;

        System.out.println("Ingrese una secuencia de números: ( Para salir ingrese un múltiplo de 5 ) ");

        do {

            System.out.println("N° " + (contadorTotal + 1) + " :");
            num = leer.nextInt();
            leer.nextLine();

            if (num % 5 == 0) {

                break;

            }

            if (num % 2 == 0) {

                contadorPares++;

            } else if (num % 2 == 1) {

                contadorImpares++;

            }

            contadorTotal++;

        } while (num % 5 != 0);

        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("Cantidad de números impares: " + contadorImpares);
        System.out.println("Cantidad de números total: " + contadorTotal);
        
    }

}
