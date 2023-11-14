import java.util.Scanner;

/**
 * Escribir un programa que pida un número al usuario e indique mediante un literal booleano
 * (true o false) si el número es par. 
 * 
 * @pablo garcia
 */
public class Ejer7
{
    public static void main(String[]args){
        System.out.println("Introduce un numero.");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        boolean num = true ==(numero%2 == 0);
        // boolena num = numero%2 !=0 ? false : true;
        System.out.println(num);
    }
}
