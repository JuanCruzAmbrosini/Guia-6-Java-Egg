/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package ejerciciosextra;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int num1 = (int) (Math.random() * 11);
        int num2 = (int) (Math.random() * 11);
        
        int multi = num1 * num2 ; 
        
        int adivin = 0;
        
        do {            
            
            System.out.println("Adivine el número que es el resultado de la multiplicación de 2 números aleatorios: ");
            adivin = leer.nextInt();
            leer.nextLine();
            
            if ( adivin == multi ){
                
                System.out.println("HA ADIVINADO EL NÚMERO!!!!");
                
            } else {
                
                System.out.println("Intentelo nuevamente.");
                
            }
            
        } while ( multi != adivin );
        
    }

}
