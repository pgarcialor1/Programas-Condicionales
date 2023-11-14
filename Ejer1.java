import java.util.Scanner;

/**
 * Diseñar un programa que pida un número al usuario-por teclado-y a continuación lo
    muestre.
 * pablo garcia 
 */
public class Ejer1
{
    public static void main(String[]args){
        System.out.println("Introduce un numero.");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println(numero);
        
    }
}
