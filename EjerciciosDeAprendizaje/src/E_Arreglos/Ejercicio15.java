/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package E_Arreglos;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [ ] vectorNumeros = new int [ 100 ];
        vectorNumeros = devolverVector(vectorNumeros);
        mostrarVector(vectorNumeros);
        
    }
    
    public static int [] devolverVector ( int [ ] vector ){
        
        for ( int i = 0 ; i<100 ; i++ ){
            
            vector[i] = i ;
            
        }
        
        return vector;
    }
    
    public static void mostrarVector (int [ ] vector){
        
        for ( int i = 99;  i >-1  ; i-- ){
            
            if ( i != 0 ){
                
                System.out.print ( vector[ i ] + " ; ");
                
            } else {
                
                System.out.println(vector [ i ]);
                
            }
            
        }
        
    }
    
}
