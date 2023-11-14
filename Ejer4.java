import java.util.Scanner;

/**
 * Crear una aplicación que calcule la media aritmética de dos notas enteras.
 * Hay que tener en cuenta que la media puede contener decimales.
 * 
 * @pablo garcia
 */
public class Ejer4
{
    public static void main(String []args){
        System.out.println("Introduce dos notas");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double resultado = (num1 + num2)/ 2;
        System.out.println("La media es: "+ resultado);
    }
}
