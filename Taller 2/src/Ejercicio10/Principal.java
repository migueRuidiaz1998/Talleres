
package Ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Jorge Miguel
 */
public class Principal {
    public static void main(String args[]){
    Scanner entrada=new Scanner(System.in);
        System.out.println("Digite peso en kilogramos para saber su equivalencia en gramos libras y toneladas");
        System.out.println("Peso: ");
    double peso=entrada.nextInt();
    
    double gram=peso*1000;
   double libra=peso*2;
   double tone=peso/1000;
   
        System.out.println("La equivalencia del peso que digito son : ");
        System.out.println("En gramos: " +gram);
        System.out.println("En libra: " +libra);
        System.out.println("En toneladas: "+tone );
    
    
     
    
    }
    
    
    
}
