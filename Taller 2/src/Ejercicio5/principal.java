
package Ejercicio5;
import java.util.Scanner;
/**
 *
 * @author Jorge Miguel
 */

public class principal {
    public static void main(String[] args){
    Scanner entrada =new Scanner(System.in);
        System.out.println("Introdusca un caracter");
        char c;
       
        c = entrada.next().charAt(0);
    
    System.out.printf("El caracter %s equivale al numero %d\n", c,(int)c);
    
    
    
    
    
    }
}
