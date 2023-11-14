package ActUnidad1;
import java.util.Scanner;


/**
 * Diseñar un algoritmo que nos indique si podemos salir a la calle.
 * Existen aspectos que influirán en esta decisión:
 * si está lloviendo y si hemos terminado nuestras tareas.
 * Solo podremos salir a la calle si no está lloviendo y hemos finalizado
 * nuestras tareas. Existe una opción en la que,
 * indistintamente de lo anterior, podremos salir a la calle:
 * el hecho de que tengamos que ir a la biblioteca (para realizar algún trabajo, entregar un libro, etc.).
 * Solicitar al usuario (mediante un booleano)
 * si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca.
 * El algoritmo debe mostrar mediante un booleano (true o false) 
 * si es posible que sele otorgue permiso para ir a la calle. 
 * 
 * @pablo garcia 
 * @version (a version number or a date)
 */
public class Ejer8
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("¿Esta lloviendo?");
        boolean llueve = sc.nextBoolean();
        
        System.out.println("¿Has hecho la tarea?");
        boolean tarea = sc.nextBoolean();
        
        System.out.println("¿Tienes que ir a la biblioteca?");
        boolean biblioteca = sc.nextBoolean();
        
        boolean respuesta = (llueve==false && tarea==true)?true:(biblioteca=true)?true:false;
        
        System.out.println(respuesta);
        
        
    }
    
    
}
