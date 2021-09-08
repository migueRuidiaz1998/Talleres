
package Ejercicio1;

/**
 *
 * @author Jorge Miguel
 */
public class PruebaRectangulo {
  
    public static void main(String[] args) {
   
         Rectangulo a = new Rectangulo();
        a.setLongitud(10);
        a.setAncho(5);
        imprimirInfoRectangulo(a);
        
           
        
        
        
        
        
        
        
    }
    
    public static void imprimirInfoRectangulo(Rectangulo r){
        System.out.println("Base: " + r.getAncho());
        System.out.println("Altura: "+ r.getLongitud());
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Perimetro"+r.calcularPerimetro());
        System.out.println("-----------------------------------");
    }
    
}
