/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package C_Bucles;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio10G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int suma = 0;
        
        System.out.println("Ingrese el límite de la suma: ");
        int limite = leer.nextInt();
        
        while (suma <= limite){
            
            System.out.println("Ingrese un valor a sumar: ");
            int num = leer.nextInt();
            
            suma += num;
            
        }
        
        System.out.println("Se ha llegado al límite estipulado!");
        
    }
    
}
