
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Jorge Miguel
 */
public class Principal {
   public static void main (String[] args ) {
   Scanner entrada =new Scanner(System.in);
       System.out.println("Por favor digite dos numeros");
       System.out.println("Numero 1: ");
       int n1=entrada.nextInt();
       System.out.println("Numero 2: ");
       int n2=entrada.nextInt();
       
       System.out.printf("numero1=%d\n",n1);
       System.out.printf("El valor de %d+%d es %d\n",n1,n1,(n1+n1));
       System.out.printf("numero1=%.2f\n",(float)n1);
       System.out.printf("%d-%d\n",(n1+n2),(n2+n1)); 
}}
