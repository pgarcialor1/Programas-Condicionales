package ActUnidad1;
import java.util.Scanner;


/**
 *Escribir un programa que pida un número al usuario y
 *muestre su valor absoluto.
 * 
 * @pablo garcia 
 * @version (a version number or a date)
 */
public class Ejer10
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta un numero");
        double num = sc.nextDouble();
        double valorAbsoluto = num*-1;
        System.out.println(num<=0? valorAbsoluto : num);
        
    }
}
