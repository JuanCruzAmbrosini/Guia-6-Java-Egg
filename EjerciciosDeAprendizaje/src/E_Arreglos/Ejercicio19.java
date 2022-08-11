/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package E_Arreglos;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la dimensión de la matriz a analizar: ");
        int dim = leer.nextInt();
        leer.nextLine();

        int matriz[][] = new int[dim][dim];

        System.out.println("Ingrese la matriz a analizar: ");
        matriz = llenadoDeMatrizCuadrada(matriz, dim);
        
        System.out.println("La matriz ingresada es: ");
        mostrarMatrizCuadrada(matriz, dim);
        
        boolean comprobanteAntiSim = comprobadorAntisimetrica(matriz, dim);
        
        if ( comprobanteAntiSim ){
            
            System.out.println("La matriz es antisimétrica!");;
            
        } else {
            
            System.out.println("La matriz NO es antisimétrica.");
            
        }
        
    }

    public static int[][] llenadoDeMatrizCuadrada(int[][] matriz, int dim) {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j < dim; j++) {

                if (i == j) {

                    matriz[i][j] = 0;

                } else {
                    
                    System.out.println("Componente ( " + i + " , " + j + " )");
                    
                    matriz[i][j] = leer.nextInt();
                    leer.nextLine();

                }//FinElse
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

    public static boolean comprobadorAntisimetrica(int[][] matriz, int dim) {

        boolean comprobante = true;

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j < dim; j++) {

                if ( matriz[i][j] != - matriz[j][i] ){
                    
                   comprobante = false;
                   
                   break;
                   
                }
            }
        }
        
        return comprobante;
        
    }
}
