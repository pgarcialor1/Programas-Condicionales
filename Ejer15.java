package ActUnidad1;
import java.util.Scanner;


/**
 * Escribe un programa que solicite, dos números y un operador(+,-,*,/).
 * Dependiendo del operador introducido, debe sumar, restar, multiplicar o dividir.�
 * 
 * @pablo garcia 
 * @version (a version number or a date)
 */
public class Ejer15
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce el 1 numero: ");
        double num1 = sc.nextDouble();
        System.out.print("Introduce el 2 numero: ");
        double num2 = sc.nextDouble();
        System.out.print("Introduce el operador (+,-,*,/) ");
        char operador = sc.next().charAt(0);
        double resultado = (operador=='+')? num1+num2 : (operador=='-')? num1-num2 :
        (operador=='*')? num1*num2 : (operador=='/')? num1/num2:num1;
        System.out.println("----------------------");
        System.out.print("Resultado: "+resultado);
        
    }
}
