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
public class Ejercicio21Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];

        matrizP = llenadoMatrizCuadrada(matrizP, 3);
        matrizM = llenadoMatrizCuadrada(matrizM, 10);

        System.out.println("======================================");

        System.out.println("Matriz M: ");
        mostrarMatrizCuadrada(matrizM, 10);
        System.out.println("======================================");
        System.out.println("Matriz P: ");
        mostrarMatrizCuadrada(matrizP, 3);
        System.out.println("======================================");
        boolean contiene = comprobador(matrizM, matrizP, 10, 3);
        System.out.println(contiene);
        
    }

    public static int[][] llenadoMatrizCuadrada(int[][] matriz, int dim) {

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j < dim; j++) {

                matriz[i][j] = (int) (Math.random() * 2 );

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

    public static boolean comprobador(int[][] matrizM, int[][] matrizP, int dimM, int dimP) {

        boolean contiene = false;
        int contador = 0;

        for (int i = 0; i < dimM-2 ; i++) {

            for (int j = 0; j < dimM-2 ; j++) {

                if (matrizM[i][j] == matrizP[0][0]) {
                    
                    contador = 0; 

                    for (int k = 0; k < dimP; k++) {

                        for (int l = 0; l < dimP; l++) {

                            if (matrizM[i + k][j + l] == matrizP[k][l]) {

                                contador++;

                                if (contador == 9) {

                                    System.out.println("( " + i + " ; " +  j + " )");
                                    
                                    return true;

                                } 

                                continue;

                            } 

                            break;

                        }
                    }
                }
            }
            
            
            
        }        
        
        return contiene;

    }
}
