/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package ejerciciosextra;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la longitud final de la escalera:");
        int longFinal = leer.nextInt();
        leer.nextLine();

        for (int i = 1; i < longFinal + 1; i++) {

            System.out.println("");

            for (int j = 1; j < i + 1 ; j++) {

                escalera(j);

            }
        }
    }
    
    public static void escalera ( int cantidad ){
        
        System.out.print(cantidad + " ");
        
    }
}
