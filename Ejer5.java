import java.util.Scanner;

/**
 * Diseñar una aplicación que calcule la longitud y el área de una circunferencia.
 * Para ello, el usuario debe introducir el radio (que puede contener decimales).
 * 
 * @pablo garcia
 */
public class Ejer5
{
    public static void main(String[]args){
        System.out.println("Introduce el radio para calcular la longitud y el area.");
        Scanner sc=new Scanner(System.in);
        double radio = sc.nextDouble();
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio,2);
        System.out.println("Con el radio "+ radio);
        System.out.println("La longitud es: "+longitud);
        System.out.println("El area es: "+area);
    }
}
