/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package E_Arreglos;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];
        
        matrizA = llenadoMatrizCuadrada(matrizA, 4);
        
        System.out.println("La matriz A es:  ");
        mostrarMatrizCuadrada(matrizA, 4);
        
        trasponerMatrizCuadrado(matrizA, matrizB, 4);
        
        System.out.println("La matriz transpuesta es: ");
        mostrarMatrizCuadrada(matrizB, 4);

    }
    
    public static int [ ][ ] llenadoMatrizCuadrada ( int [][] matriz , int dim ){
        
        for ( int i = 0 ; i < dim ; i++ ){
            
            for (int j = 0 ; j < dim ; j++) {
                
                matriz [ i ][ j ] = (int) (Math.random() * 10) ;
                
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

    public static int[][] trasponerMatrizCuadrado(int[][] matrizA, int[][] matrizB, int dim) {

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j < dim; j++) {
                
                matrizB [ i ][ j ] = matrizA[ j ][ i ];
                
            }
        }
        
        return matrizB;
        
    }
}
