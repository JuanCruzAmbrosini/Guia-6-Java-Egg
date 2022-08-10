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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la moneda a la cual desea hacer la transformación: ");
        System.out.println("Dólares.");
        System.out.println("Yenes.");
        System.out.println("Libras. ");
        
        String moneda = leer.nextLine();
        
        System.out.println("Ingrese la cantidad de euros que desea ingresar.");
        float cantidadEuros = leer.nextFloat();
        
        conversionMoneda(moneda, cantidadEuros);
        
    }
    
    public static void conversionMoneda(String moneda, double cantidadEuros) {
        
        switch ( moneda ){
            
            case "dolares" : 
                
                double dolar = cantidadEuros * 1.28611;
                System.out.println( cantidadEuros + " euros son " + (float) dolar + " dólares."  );  
               break;
               
            case "yenes":

                double yen = cantidadEuros * 129.852;
                System.out.println(cantidadEuros + " euros son " + (float) yen + " yenes.");
                break;

            case "libras":

                double libras = cantidadEuros * 0.86;
                System.out.println(cantidadEuros + " euros son " +(float)  libras + " libras.");
                break;

        }
        
    }
    
}
