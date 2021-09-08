package Ejercicio2;

/**
 *
 * @author Jorge Miguel
 */
public class Principal {
    public static void main(String[] args) {
        
        Ecuacion a = new Ecuacion();
        a.setA(2);
        a.setB(4);
        a.setC(3);
        a.setX(2);
        
        
        a.getA();
        a.getB();
        a.getC();
        a.getX();
        
        System.out.println("El valor de Y es: " + a.imprimirY());
        
    }
  
}
