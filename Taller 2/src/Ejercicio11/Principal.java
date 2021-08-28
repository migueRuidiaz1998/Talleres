
package Ejercicio11;

import java.util.Scanner;

/**
 *
 * @author Jorge Miguel
 */
public class Principal {
  
    public static void main(String arg[]){
    
    Scanner entrada= new Scanner(System.in);
        System.out.println("Digite numero entre 0 - 1000");
        int nume=entrada.nextInt();
        int cen = nume/100;
        int rest= nume-(cen*100);
        int dec= rest/10;
        int uni = rest-(dec*10);
        
        System.out.println("Las unidades son: " +uni);
        System.out.println("Las decenas son: " +dec);
        System.out.println("Las centenas son: "+cen);
        
    
    
    
    
    }
    
    
    
    
}
