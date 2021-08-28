
package Ejercicio2;
import java.util.Scanner;

/**
 *
 * @author Jorge Miguel
 */
public class Principal {
    public static void main(String[]args){
    
        Scanner entrada =new Scanner(System.in);
        System.out.println("Introdusca dos numeros enteros");
        System.out.println(" Entero 1");
        int n1=entrada.nextInt();
        System.out.println("Entero 2");
        int n2=entrada.nextInt();
 
        
    int sum=n1+n2;
    int product=n1*n2;
    int rest=n1-n2;
    
        System.out.println("La suma es: "+sum);
        System.out.println("El producto es : "+product);
        System.out.println("La resta es : "+rest);
    }
    
}