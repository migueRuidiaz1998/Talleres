
package Ejercicio3;

/**
 *
 * @author Jorge Miguel
 */
public class PrincipalHabitacion {
    public static void main(String[] args) {
        
        
        
     Habitacion a = new Habitacion();
        a.setLargo(10);
        a.setAncho(18);
        a.setAltura(230);
        imprimirInfoHabitacion(a);
        
        
        
        
        
        
        
        
    }
  
    
    public static void imprimirInfoHabitacion(Habitacion r){
        System.out.println("Largo: " + r.getLargo());
        System.out.println("Ancho: " + r.getAncho());
        System.out.println("Altura: "+ r.getAltura());
      
        System.out.println("Los metros cuadrados para la habitacion son: " + r.calcularMetros());
        System.out.println("Los metros cuadrados para el tapizaje es: "+r.calcularPapel());
        System.out.println("-----------------------------------");
    }
    
    
    
    
    
    
    
    
}
