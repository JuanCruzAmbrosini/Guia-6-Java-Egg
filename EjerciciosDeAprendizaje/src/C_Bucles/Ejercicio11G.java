/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package C_Bucles;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class Ejercicio11G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        int num2 = leer.nextInt();
        
        int opcion;
        
        String continuar = "S";
        
        while ("S".equalsIgnoreCase(continuar)) {            
        
        System.out.println("Ingrese la opción deseada: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        
        opcion = leer.nextInt();
        
        switch (opcion){
            
            case 1 : 
                
                int suma = num1 + num2;
                System.out.println("La suma de " + num1 + " y " + num2 + " es de : " + suma);
                break;

            case 2:

                int resta = num1 - num2;
                System.out.println("La resta de " + num1 + " y " + num2 + " es de : " + resta);
                    break;

                case 3:

                    int multi = num1 * num2;
                    System.out.println("La multiplicación de " + num1 + " y " + num2 + " es de : " + multi);
                    break;

                case 4:

                    float divi = (float) num1 / num2;
                    System.out.println("La división de " + num1 + " y " + num2 + " es de : " + divi);
                    break;

                case 5:

                    System.out.println("Desea continuar con la operación? (s/n)");
                    continuar = leer.next();
                    break;
                    
                default :
                    
                    System.out.println("Ingrese una opcion válida.");

            }
        }
    }
}
