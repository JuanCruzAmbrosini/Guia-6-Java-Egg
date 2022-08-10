/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package E_Arreglos;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la dimensión del vector.");
        int dim = leer.nextInt();

        int[] vector = new int[dim];

        System.out.println("Ingrese los componentes del vector: ");

        for (int i = 0; i < dim; i++) {

            System.out.println("Componente " + i + ": ");
            vector[i] = leer.nextInt();
        }

        System.out.println("El vector final es de: ");

        int contador = 0;

        for (int elemento : vector) {

            if (contador == (dim - 1)) {

                System.out.print(elemento);

            } else {

                System.out.print(elemento + " ; ");

            }

            contador++;

        }
        System.out.println("");
        
        
        
    }

}
