package ActUnidad1;
import java.util.Scanner;


/**
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la
 * asignatura Programación para obtener la media deseada. Hay que tener en cuenta que la
 * nota del primer examen cuenta el 40% y la del segundo examen un 60%.
 * 
 * @pablo garcia 
 * @version (a version number or a date)
 */
public class Ejer17
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double nota1 = sc.nextDouble();
        System.out.print("¿Que nota quieres sacar en el trimestre?");
        double notaTrimestre = sc.nextDouble();
        double resultado = (notaTrimestre - (nota1 * 0.4))/0.6;
        System.out.println("Para sacar un "+notaTrimestre+" en el trimestre necesitas sacar un "
        +resultado+" en el segundo examen");
    }
}
