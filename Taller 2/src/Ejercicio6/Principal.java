
package Ejercicio6;
import java.util.Scanner;
/**
 *
 * @author Jorge Miguel
 */
public class Principal {
   public static void main(String[] args){
   Scanner entrada= new Scanner(System.in);
       System.out.println("Para calcular su indice de masa corporal digite");
       System.out.print("peso: ");
       float p= entrada.nextFloat();
       System.out.print("Altura: ");
       float a= entrada.nextFloat();
   
   float masa=p*(a*a);
   
       System.out.println("Su indice de masa corporal es de " +masa);
   
   } 
}
