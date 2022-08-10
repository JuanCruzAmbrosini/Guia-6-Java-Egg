/*
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package PrevEjercicios;

import java.util.Scanner;

/**
 *
 * @author Juan Cruz
 */
public class EjercicioM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String aux = "";

        System.out.println(" Ingrese la cantidad de alumnos a ingresar: ");
        int cantAlumnos = leer.nextInt();
        leer.nextLine();

        String [] nombresAlumnos = new String[cantAlumnos];

        for (int i = 0; i < cantAlumnos; i++) {

            System.out.println("Ingrese el alumno N° " + (i + 1));
            nombresAlumnos[i] = leer.nextLine();

        } //FinFor

        System.out.println("El nombre de los alumnos es: ");

        for (String elementos : nombresAlumnos) {

            aux += " | "  +  elementos   ;
        }
        System.out.print(aux);
        System.out.println(" | ");
    }
}
