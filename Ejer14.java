package ActUnidad1;
import java.util.Scanner;


/**
 * Realiza un conversor de euros a dólares. La cantidad de euros que
 * se quiere convertir debe ser introducida por teclado.
 * El cambio es 1 Dólar son 0,85 euros.�
 * 
 * @pablo garcia 
 * @version (a version number or a date)
 */
public class Ejer14
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de euros.");
        double euros = sc.nextDouble();
        System.out.println("Con la conversion a dolares quedaria un total de: " + (euros*1.05));
        
    }
}
