/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package ejerciciosextra;

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
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un tiempo en minutos: ");
        int minuto = leer.nextInt();
        
        conversorDiasHoras(minuto);
        
    }
    
    public static void conversorDiasHoras ( int minutos) {

        int horas = ( minutos % 1440)/60 ;
        int dias = minutos / 1440  ;
        
        System.out.println(" Dias:  " +  dias  + "  |  Horas :  " + horas );
        
    }

}
