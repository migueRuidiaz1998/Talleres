
package Ejercicio9;
import java.util.Scanner;


/**
 *
 * @author Jorge Miguel
 */
public class Principal {
    public static void main(String args[]){
    
    Scanner entrada=new Scanner(System.in);
        System.out.println("Para saber el costo total de su viaje por favor digite");
        System.out.println("Numeros de dias de su viaje");
        int dias= entrada.nextInt();
        System.out.println("Kilometros conducidos por dia");
        int kilo=entrada.nextInt();
        System.out.println("Promedio de kilometros por litro de gasolina");
        float prome=entrada.nextFloat();
        System.out.println("Litros de gasolina por dia");
        int litrogas=entrada.nextInt();    
        System.out.println("Costo por litro de gasolina");
        int gasolina=entrada.nextInt();
        System.out.println("Pago de estacionamiento por dia");
        int estacio=entrada.nextInt();
        System.out.println("Pago de peaje por dia");
        int peaje=entrada.nextInt();
        
      double tgasolina=dias*litrogas*gasolina;
      double testacio=dias*estacio;
      double tpeaje=dias*peaje;
      double costotal=tgasolina+testacio+tpeaje;
        System.out.println("El costo total de su viaje fue de: " +costotal);
    
    
    
    
    
    }

}