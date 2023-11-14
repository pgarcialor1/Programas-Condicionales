package ActUnidad1;
import java.util.Scanner;


/**
 * Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (notas
 * enteras que se solicitarán al usuario). El programa debe mostrar la nota media del curso
 * como se utiliza en el boletín de calificaciones (solo la parte entera) y 
 * como se usa en el expediente académico (con decimales).
 * 
 * @pablo garcia 
 * @version (a version number or a date)
 */
public class Ejer11
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota del 1º trimestre.");
        double primerTrimes = sc.nextDouble();
        
        System.out.println("Introduce la nota del 2º trimestre.");
        double segunTrimes = sc.nextDouble();
        
        System.out.println("Introduce la nota del 3º trimestre.");
        double tercerTrimes = sc.nextDouble();
        
        int boletin = (((int)primerTrimes) + ((int)segunTrimes) + ((int)tercerTrimes)) / 3;
        double expediente = (primerTrimes + segunTrimes + tercerTrimes) / 3;
        
        System.out.println("Nota boletin: " + boletin);
        System.out.println("Nota expediente: " + expediente);
        
    }
}
