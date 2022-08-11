/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package E_Arreglos;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[] vectorSumaTotal = new int[8];
        int[][] matriz = new int[3][3];

        System.out.println("Ingrese la matriz: ");
        llenadoDeMatrizCuadrada(matriz, 3);

        System.out.println("=========================================");

        mostrarMatrizCuadrada(matriz, 3);
        System.out.println("=========================================");
        llenadoVectorMagicoFilas(matriz, vectorSumaTotal, 3);
        llenadoVectorMagicoColumnas(matriz, vectorSumaTotal, 3);
        llenadoVectorMagicoDiagonales(matriz, vectorSumaTotal, 3);
        mostrarVector(vectorSumaTotal, 8);
        System.out.println("=========================================");

        if (comprobacionMagica(vectorSumaTotal, 8)) {

            System.out.println("La matriz ES MÁGICA.");

        } else {

            System.out.println("La matriz NO es mágica :( .");
            
        }
    }

    public static int[][] llenadoDeMatrizCuadrada(int[][] matriz, int dim) {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j < dim; j++) {

                do {

                    System.out.println("Componente ( " + i + " , " + j + " )");

                    matriz[i][j] = leer.nextInt();
                    leer.nextLine();

                } while (matriz[i][j] < 1 || matriz[i][j] > 9);
            }//FinFor 
        }//FinFor

        return matriz;

    }//FinSubalgoritmo

    public static void mostrarMatrizCuadrada(int[][] matriz, int dim) {

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j < dim; j++) {

                if (j != dim - 1) {

                    System.out.print(matriz[i][j] + " ; ");

                } else {

                    System.out.println(matriz[i][j]);

                }
            }
        }
    }

    public static void llenadoVectorMagicoFilas(int[][] matriz, int[] vectorSumaTotal, int dim) {

        int suma = 0;

        for (int i = 0; i < dim; i++) {

            for (int c = 0; c < dim; c++) {

                suma += matriz[i][c];
                vectorSumaTotal[i] = suma;
            }
            suma = 0;
        }
    }
    
    public static void llenadoVectorMagicoColumnas ( int [][] matriz, int [] vectorSumaTotal, int dim){
        
        int c = 0;
        int suma = 0;
        
        for (int i = (dim); i < (2*dim); i++) {
            
            for (int j = 0; j < dim; j++) {
                
                suma += matriz [ j ] [ c ];
                
            }
            
            c++;
            vectorSumaTotal[i] = suma;
            suma = 0;
        }

    }

    public static void llenadoVectorMagicoDiagonales(int[][] matriz, int[] vectorSumaTotal, int dim) {

        int suma1 = 0;
        int suma2 = 0;

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {

                if (i == j) {

                    suma1 += matriz[i][j];

                }
            }
        }
        vectorSumaTotal[2 * dim] = suma1;

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {

                if (i + j == dim - 1) {

                    suma2 += matriz[i][j];

                }
            }
        }
        vectorSumaTotal[2 * dim + 1] = suma2;
    }
    
    public static boolean comprobacionMagica ( int [ ] vector , int dim ){
        
        boolean magico = true;
        
        for (int i = 0; i < dim - 1; i++) {
            
            if ( vector[i] != vector[i+1] ){
                
             magico = false;
             
             break;
                
            }
        }
        
        return magico;
        
    }

    public static void mostrarVector(int[] vector, int dim) {

        for (int i = 0; i < dim; i++) {
            if (i != dim - 1) {

                System.out.print(vector[i] + " ; ");

            } else {

                System.out.println(vector[i]);
                
            }
        }
    }
}
