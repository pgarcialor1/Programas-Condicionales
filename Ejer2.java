import java.util.Scanner;

/**
 * Pedir al usuario su edad y mostrar la que tendrá el próximo año
 * 
 * @pablo garcia
 */
public class Ejer2
{
    public static void main(String[]args){
        System.out.println("Introduzca su edad.");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        System.out.println("El año que viene tendras: "+edad + 1+" años");
    }
}
