package ActUnidad1;
import java.util.Scanner;


/**
 * Escribe un programa que calcule el área de un rectángulo, a partir de la base y altura
 * introducida por teclado.
 * 
 * @pablo garcia 
 * @version (a version number or a date)
 */
public class Ejer16
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la base.");
        double base = sc.nextDouble();
        System.out.println("Introduce la altura.");
        double altura = sc.nextDouble();
        System.out.println("El area es: "+(base*altura));
    }
}
