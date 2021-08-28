/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercico7;
import java.util.Scanner;
/**
 *
 * @author Jorge Miguel
 */
public class Principal {
    public static void main(String[] args  ){
       
            Scanner entrada=new Scanner(System.in);
        System.out.println("Si desea conocer su porcentaje de utilidad por favor digite ");
        System.out.print("Precio de compra del producto: ");
        float precio1=entrada.nextFloat();
        System.out.printf("Precio de venta del producto: ");
         float precio2=entrada.nextFloat();
        
        float utilidad = (precio2-precio1)/precio2*100;
         
         System.out.println("El porcentaje de utilidad de su producto es: " +utilidad);
    }
}
