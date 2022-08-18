/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
 */
package ejerciciosextra;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números a comparar");
        int cantNumeros = leer.nextInt();
        leer.nextLine();
        
 //       comparadorNumeros(cantNumeros);  //Método con while 
        comparadorNumeros2(cantNumeros);  //Método con do-While
        
    }
    
    public static void comparadorNumeros ( int n ){

        Scanner leer = new Scanner(System.in);

        int contador = 0;
        double num = 0;
        double numMax = 0;
        double numMin = 0;
        double suma = 0;
        
        while ( contador < n ){
            
            System.out.println("Ingrese el número " + (contador + 1) + ": ");
            num = leer.nextInt();
            leer.nextLine();

            if (contador == 0) {

                numMax = num;
                numMin = num;

            } else if (num > numMax) {
                
                numMax = num;

            }else if (num < numMin) {

                numMin = num;

            }
            
            suma += num;
            
             contador++;
        }
        
        System.out.println("El número de mayor valor es: " + numMax);
        System.out.println("El número de menor valor es: " + numMin);
        System.out.println("El promedio de todos los números es de: " + (double)(suma/n));
        
    }
    
        public static void comparadorNumeros2 ( int n ){
            
        Scanner leer = new Scanner(System.in);

        int contador = 0;
        double num = 0;
        double numMax = 0;
        double numMin = 0;
        double suma = 0;

        do {

            System.out.println("Ingrese el número " + (contador + 1) + ": ");
            num = leer.nextInt();
            leer.nextLine();

            if (contador == 0) {

                numMax = num;
                numMin = num;

            } else if (num > numMax) {

                numMax = num;

            } else if (num < numMin) {

                numMin = num;

            }

            suma += num;

            contador++;

        } while (contador != n );
        
        System.out.println("El número de mayor valor es: " + numMax);
        System.out.println("El número de menor valor es: " + numMin);
        System.out.println("El promedio de todos los números es de: " + (double)(suma/n));
        
    }

}
