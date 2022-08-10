/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package D_FuncionesYSubalgoritmos;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio14G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de dinero a cambiar (euros): ");
        double cantidadEuros = leer.nextDouble();
        leer.nextLine();

        System.out.println("Indique a que moneda quiere convertir: ");
        System.out.println("Libras.");
        System.out.println("Dolares.");
        System.out.println("Yenes.");

        String destinoMoneda = leer.nextLine();
        
        conversionMoneda(cantidadEuros, destinoMoneda);

    }

    public static void conversionMoneda(double cantidadEuros, String destinoMoneda) {

        switch (destinoMoneda.toLowerCase()) {

            case "libras":

                double libras = cantidadEuros * 0.86;

                System.out.println("La cantidad de libras es de: " + libras);

                break;

            case "dolares":

                double dolares = cantidadEuros * 1.28611;

                System.out.println("La cantidad de dolares es de: " + dolares);

                break;

            case "yenes":

                double yenes = cantidadEuros * 129.852;

                System.out.println("La cantidad de yenes es de: " + yenes);

                break;
        }

    }

}
