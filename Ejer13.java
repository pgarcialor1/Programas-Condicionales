package ActUnidad1;
import java.util.Scanner;


/**
 * Realiza un programa que pida dos números que pueden tener decimales y
 * que luego muestre el resultado de su multiplicación.�
 * 
 * @pablo garcia
 * @version (a version number or a date)
 */
public class Ejer13
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce el 1 numero: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduce el 2 numero: ");
        double num2 = sc.nextDouble();
        
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }
}
