
package Ejercicio5;

/**
 *
 * @author Jorge Miguel
 */
public class Principal {
    public static void main(String[] args) {
        
        TrianguloIso n = new TrianguloIso();
        n.setAltura(14);
        n.setBase(12);
      imprimirInfotriangulo(n);
        
        
        
        
    }
 
    
     public static void imprimirInfotriangulo(TrianguloIso a){
        System.out.println("Base: " + a.getBase());
        System.out.println("Altura: "+ a.getAltura());
        System.out.println("Area: " + a.CalcurArea());
         System.out.println("Lados: "+a.CalcularLados());
        System.out.println("Perimetro"+a.CalcularPerimetro());
        System.out.println("-----------------------------------");
    }
    
    
    
}
