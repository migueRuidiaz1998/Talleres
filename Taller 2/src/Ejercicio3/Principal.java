

package Ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Jorge Miguel
 */
public class Principal {
    public static void main(String[]args){
    
    Scanner entrada=new Scanner(System.in);
        System.out.println("Introducir tres numeros decimales");
        System.out.println("Primer decimal:");
        double n1=entrada.nextDouble();
        
        System.out.println("Segundo decimal:");
        double n2=entrada.nextDouble();
        
        System.out.println("tercer decimal:");
        double n3=entrada.nextDouble();
        
        double sum=n1+n2+n3;
        double prom=sum/3;
        double mult=n1*n2*n3;
        double coci=sum/3;
        double modu=sum%3;
    
        System.out.printf("La suma de %.2f+%.2f+%.2f = %.2f\n ",n1,n2,n3,sum );
        System.out.printf("El promedio de %.2f+%.2f+%.2f = %.2f\n ",n1,n2,n3,prom);
        System.out.printf("El producto de %.2f*%.2f*%.2f = %.2f\n " ,n1,n2,n3,mult);
        System.out.printf("El cociente de %.2f+%.2f+%.2f = %.2f\n ",n1,n2,n3,coci);
        System.out.printf("El modulo de %.2f+%.2f+%.2f  = %.2f\n",n1,n2,n3,modu);
               
    }
}
