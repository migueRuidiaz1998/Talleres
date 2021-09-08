
package Ejercicio6;

/**
 *
 * @author Jorge Miguel
 */
public class Principal {
    public static void main(String[] args) {
      Bicicleta a = new Bicicleta();
      a.setVelocidadActual(12);
      a.setPlatoactual(6);
      a.setPinonactual(3);
        imprimirInfoBicicleta(a);
        
        
    }
    
    
   public static void imprimirInfoBicicleta(Bicicleta b){
       System.out.println("Velocidad Actual: "+b.getVelocidadActual());
       System.out.println("Plato Atual: "+b.getPlatoactual());
       System.out.println("Piñon Actual: "+b.getPinonactual());
        System.out.println("Acelelacion: " +b.acelerar());
        System.out.println("Frenado: " +b.frenar());
        System.out.println("El cambio de plato: " +b.cambiarPlato(3));
        System.out.println("El cambio de piñon: " +b.cambiarPinon(6));
        System.out.println("-----------------------------------");
    } 
    
    
}
