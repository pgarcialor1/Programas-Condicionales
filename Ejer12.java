package ActUnidad1;
import java.util.Scanner;
import java.lang.Math;


/**
 * Realizar un programa que pida como entrada un número decimal y lo muestre redondeado
 * al entero más próximo.
 * 
 * @pablo garcia 
 * @version (a version number or a date)
 */
public class Ejer12
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero con decimales.");
        double num = sc.nextDouble();
        num = Math.round(num);
        System.out.println( num );
        
    }
}
