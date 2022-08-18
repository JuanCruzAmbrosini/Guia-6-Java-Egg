/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package ejerciciosextra;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner ( System.in );
        
        int resto = 0; 
        int cociente = 0;
        
        System.out.println("Ingrese el dividendo: ");
        int dividendo = leer.nextInt();
        leer.nextLine();

        System.out.println("Ingrese el divisor: ");
        int divisor = leer.nextInt();
        leer.nextLine();

        if (dividendo < divisor) {

            System.out.println("Los datos ingresados no son válidos.");

        }

        while (dividendo > divisor ){
            
            dividendo = dividendo - divisor;
            
            cociente++;
           
            if ( dividendo < divisor ){
     
                resto = dividendo;
                
                System.out.println("El residuo es: " + resto + " y el cociente es: " + cociente + ".");
              
            } else if (dividendo == divisor) {

                System.out.println("El residuo es: " + resto + " y el cociente es: " + cociente + ".");

            }
        }
    }
}
