/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package E_Arreglos;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];

        System.out.println("=====================================");

        matrizM = llenadoMatrizCuadradaAleatorio(matrizM, 10);

        System.out.println("Matriz M: ");
        mostrarMatrizCuadrada(matrizM, 10);

        System.out.println("=====================================");

        System.out.println("Ingrese los valores de la matriz P: ");
        llenadoDeMatrizCuadrada(matrizP, 3);
        System.out.println("=====================================");
        mostrarMatrizCuadrada(matrizP, 3);
        
        buscadorSubMatriz(matrizM, matrizP);
    }

    public static int[][] llenadoMatrizCuadradaAleatorio(int[][] matriz, int dim) {

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j < dim; j++) {

                matriz[i][j] = (int) (Math.random() * 10);

            }//FinFor
        }//FinFor

        return matriz;

    }//FinSubalgoritmo

    public static int[][] llenadoDeMatrizCuadrada(int[][] matriz, int dim) {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j < dim; j++) {

                System.out.println("Componente ( " + i + " , " + j + " )");

                matriz[i][j] = leer.nextInt();
                leer.nextLine();

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

    public static void buscadorSubMatriz ( int [][] matrizM , int [][] matrizP ){
        
        int contador = 0;
        boolean contiene = false;
        
        for (int i = 0; i < 8; i++) {
            
            for (int j = 0; j < 8; j++) {
                
                if ( matrizM[i][j] == matrizP[0][0] ){
                    
                    contador = 0;
                    
                    for (int k = 0; k < 3; k++) {
                        
                        for (int l = 0; l < 3; l++) {
                            
                            if ( matrizP[ k ][ l ] == matrizM[ i + k ][ j + l ]){
                                
                                contador++;
                                
                                if ( contador == 9 ){
                                    
                                    System.out.println("La matriz P está contenida en la matriz M en las coordenadas ( " + i + " ; " + j + " )" );
                                    
                                    contiene = true;
                                    
                                } 
                                
                            }
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }

        if (!contiene) {

            System.out.println("No se encontró la matriz P en la matriz M.");

        }

    }
}
