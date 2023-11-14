package ActUnidad1;
import java.util.Scanner;


/**
 *Un frutero necesita calcular los beneficios anuales que obtiene de la venta
 *de manzanas y peras. Por este motivo, es necesario diseñar una aplicación
 *que solicite las ventas (en kilos)de cada semestre para cada fruta.
 *La aplicación mostrará el importe total sabiendo que el precio del kilo de
 *manzanas está fijado en 2,35 €y el kilo de peras en 1,95 €
 * 
 * @pablo garcia 
 * @version (a version number or a date)
 */
public class Ejer9
{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserta los kilos vendidos de manzanas");
        double kiloManza = sc.nextDouble();
        
        System.out.println("Inserta los kilos vendidos de peras");
        double kiloPera = sc.nextDouble();
        
        double precioManzana = 2.35;
        double precioPera = 1.95;
        
        System.out.println("Importe total de manzanas: "+ kiloManza * precioManzana);
        System.out.println("Importe total de manzanas: "+ kiloPera * precioPera);
        
        
    }
}
