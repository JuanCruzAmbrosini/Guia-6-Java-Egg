/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package E_Arreglos;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
       
        System.out.println("Ingrese la dimensión del vector: ");
        int dim = leer.nextInt();
        leer.nextLine();

        int[] vector = new int[dim];

        vector = llenadoAleatorioVector(vector, dim);
        mostradoDeVectorN(vector, dim);

        System.out.println("Ingrese el número que desea buscar en el vector: ");
        int num = leer.nextInt();
        leer.nextLine();
        
        comprobador(vector, dim, num);
        
    }
    
    public static int [ ] llenadoAleatorioVector( int [ ] vector , int dim ){
        
        vector = new int [ dim ]; 
        
        for ( int i = 0 ; i < dim ; i++ ){
            
            vector [ i ] = (int) (Math.random() * 10);
            
        }
        
        return vector;
    }
    
    public static void  mostradoDeVectorN ( int [ ] vector , int dim  ){
        
        for (int i = 0 ; i < dim ; i++) {
            
            if ( i != dim - 1) {
                
                System.out.print( vector[i] + " ; " );
                
            }else{
                
                System.out.println( vector[i] );
                
            }
            
        }
        
    }

    public static void comprobador(int[] vector, int dim, int num) {

        int contador = 0;

        for (int i = 0; i < dim; i++) {

            if (vector[i] == num) {

                contador++;

            }
        }
        if (contador == 0) {

            System.out.println("El número no esta presente en el vector.");

        } else {
            System.out.println("El número " + num + " se encuentra en la/s posición/es: ");

            for (int i = 0; i < dim; i++) {

                if (vector[i] == num) {
                    
                    System.out.println( i );
                }
            }
            System.out.println("El número se repite " + contador + " veces.");
        }
    }
}
