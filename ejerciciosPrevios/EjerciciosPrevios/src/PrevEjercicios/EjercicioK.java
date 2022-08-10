cla/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

a   e  i   o  u
@ #  $  %  *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package PrevEjercicios;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class EjercicioK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cadenaCifrada = "";
        cadenaCifrada = cifrado(cadenaCifrada);
        
        System.out.println("El mensaje cifrado es: " + cadenaCifrada);
        
    }

    public static String cifrado(String caracter) {

        Scanner leer = new Scanner(System.in);

        String cadena = "";
        caracter = "";
        String cadenaOrig = "";

        System.out.println("Ingrese un caracter para formar una cadena. finalize utilizando un punto.");

        while (!".".equals(caracter)) {

            caracter = leer.nextLine();

           cadenaOrig = cadenaOriginal(cadenaOrig, caracter);

            switch (caracter) {

                case "a":
                case "A":

                    cadena = cadena.concat("@");

                    break;

                case "e":
                case "E":

                    cadena = cadena.concat("#");

                    break;

                case "i":
                case "I":

                    cadena = cadena.concat("$");

                    break;

                case "o":
                case "O":

                    cadena = cadena.concat("%");

                    break;

                case "u":
                case "U":

                    cadena = cadena.concat("*");

                    break;

                default:

                    cadena = cadena.concat(caracter);

            }
        }
        
        
        System.out.println("El mensaje original es: " + cadenaOrig);
        
        return cadena;
    }

    public static String cadenaOriginal( String cadena , String caracter ){
        
        cadena = cadena.concat(caracter);
        
      return cadena;
    }
    
}

