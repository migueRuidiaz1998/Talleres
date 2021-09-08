
package Ejercicio4;

/**
 *
 * @author Jorge Miguel
 */
public class PruebaCoche {
    public static void main(String[] args) {
        
     Coche c = new Coche();
     c.setColor("Rojo");
     c.setMarca("Nissan");
     c.setModelo(2019);
     c.setNoCaballo(2);
     c.setNoPuertas(4);
     c.setMatricula("ABSD");
     MostrarCoche(c);
     
     Coche a = new Coche();
     MostrarCoche(a);
     
    
     
     Coche b = new Coche();
     b.setColor("Verde");
     b.setMarca("Mazda");
     b.setModelo(2012);
     b.setNoCaballo(2);
     b.setNoPuertas(2);
     b.setMatricula("WKLW");
     
     System.out.println("Color: " +b.getColor());
     System.out.println("Marca: "+b.getMarca());
     System.out.println("Modelo: " +b.getModelo());
     System.out.println("No Caballo: " +b.getNoCaballo());
     System.out.println("No Puertas: "+b.getNoPuertas());
     System.out.println("Matricula: "+b.getMatricula());
     System.out.println("-----------------------------------");
     
     
     
     
     Coche x = new Coche("rojo", "Mazda", 2014, 2 , 2, "XHJKL");
     MostrarCoche(x);
     
     
    }
 
    
 public static void MostrarCoche(Coche a){
        
        System.out.println("Color: " +a.getColor());
        System.out.println("Marca: "+a.getMarca());
        System.out.println("Modelo: " +a.getModelo());
        System.out.println("No Caballo: " +a.getNoCaballo());
        System.out.println("No Puertas: "+a.getNoPuertas());
        System.out.println("Matricula: "+a.getMatricula());
        System.out.println("-----------------------------------");
 
 
 
 
 
 
 }   
    
    
    
}
