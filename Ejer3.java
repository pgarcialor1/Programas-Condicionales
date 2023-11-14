import java.util.Scanner;

/**
 * Escribir una aplicación que pida el año actual y el de nacimiento del usuario.
 * Debe calcular su edad.
 * suponiendo que en el año en curso el usuario ya ha cumplido años. 
 * 
 * @pablo garcia
 */
public class Ejer3
{
    public static void main(String[]args){
        System.out.println("Introduzca el año actual.");
        Scanner sc = new Scanner(System.in);
        int año = sc.nextInt();
        System.out.println("Introduce el año en el que nacistes.");
        int edad = sc.nextInt();
        int resultado = año - edad;
        System.out.println("tu edad es: "+ resultado + " años");
    }
}
