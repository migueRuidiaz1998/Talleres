
package Ejercicio4;
import java.util.Scanner;
/**
 *
 * @author Jorge Miguel
 */
public class Principal {
    public static void main(String[]args ){
        
        final double PI=3.141592;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Por favor digite el valor del radio");
        System.out.print("r: ");
        double r =entrada.nextDouble();
    
    double longi=2*PI*r;
    double ar=PI*(r*r);
    
        System.out.printf("El valor de la longitud es: %.2f\n ",longi);
        System.out.printf("El valor del area es: %.2f\n ",ar);
    
    }
}
