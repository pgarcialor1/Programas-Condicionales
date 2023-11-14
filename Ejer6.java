import java.util.Scanner;

/**
 * Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad
 * (mediante un literal booleano: true o false). 
 * 
 * @pablo garcia
 */
public class Ejer6
{
    public static void main(String[]args){
        System.out.println("Introduce tu edad.");
        Scanner sc=new Scanner(System.in);
        int edad = sc.nextInt();
        
        boolean edadA = true==(edad>17);
        System.out.println(edadA);
    }
}
