
package Ejercicio11;

/**
 *
 * @author Jorge Miguel
 */
public class Principal {
    public static void main(String[] args) {
        
        Fraccion f1 = new Fraccion(4, 4); 
        Fraccion f2 = new Fraccion(6, 2); 
        Fraccion f3 = new Fraccion(); 
        Fraccion f4 = new Fraccion(4); 
        
        Fraccion suma = f1.sumar(f2);
        Fraccion resta = f1.restar(f3);
        Fraccion producto = f1.multiplicar(f4);
        Fraccion cociente = f1.dividir(f2);
        //mostrar resultados
        System.out.println(f1 + " + " + f2 + " = " + suma);
        System.out.println(f1 + " - " + f3 + " = " + resta);
        System.out.println(f1 + " * " + f4 + " = " + producto);
        System.out.println(f1 + " / " + f2 + " = " + cociente);  
        
        
        
        
        
    }
 
}
