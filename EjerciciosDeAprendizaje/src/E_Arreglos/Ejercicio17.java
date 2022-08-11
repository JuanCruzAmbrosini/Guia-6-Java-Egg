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
        
        System.out.println("Ingrese la dimensión del vector: ");
        int dim = leer.nextInt();
        leer.nextLine();
        
        int [ ] vector = new int [ dim ];
        vector = llenadoDeVector(vector, dim);
        muestraVector(vector);
        contadorNumeros(vector, dim);
        
    }
    
    public static int [] llenadoDeVector ( int [] vector, int dim ) {
        
        vector = new int [ dim ];
        
        for ( int i = 0 ; i < dim ; i++ ) {
            
            vector [ i ] = (int) (Math.random() *100000);

        }

        return vector;

    }

    public static void muestraVector(int[] vector) {

        for (int elemento : vector) {

            System.out.print(elemento + "   ");
        }
        System.out.println("");
    }

    public static void contadorNumeros(int[] vector, int dim) {

        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;

        for (int i = 0; i < dim; i++) {
            
            if ( vector [ i ] < 10 ){
                
                contador1++;
                
            } else if (vector[ i ] < 100 && vector[i] > 9 ){
                
                contador2++;
                
            }else if (vector[ i ] < 1000 && vector[i] > 99 ){
             
                contador3++;
                        
            }else if (vector[ i ] < 10000 && vector[i] > 999){
                
               contador4++; 
                
            }else if (vector[ i ] < 100000 && vector[i]> 9999 ){
                
                contador5++;
                
            } 
        }
        
        System.out.println("La cantidad de números de una cifra es de: " + contador1);
        System.out.println("La cantidad de números de dos cifras es de: " + contador2);
        System.out.println("La cantidad de números de tres cifras es de: " + contador3);
        System.out.println("La cantidad de números de cuatro cifras es de: " + contador4);
        System.out.println("La cantidad de números de cinco cifras es de: " + contador5);
        
    }
}



