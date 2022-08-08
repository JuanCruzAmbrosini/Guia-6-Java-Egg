/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*      *
*      *
* * * *
 */
package C_Bucles;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de elementos que tendrá el rectángulo: ");
        int n = leer.nextInt();

        for (int i = 0; i < n ;  i++) {
            
            for (int j = 0 ; j < n ; j++) {
            
                if ( i == 0 || i ==  n-1 || j == 0 || j == n-1 ){
                 
                    if (j < n-1){
                        
                        System.out.print(" * ");
                        
                    }else{
                        
                        System.out.println(" * ");
                        
                    }
                    
                }else{
                    
                    System.out.print("   ");
                    
                }
            }
        }
    }
}
