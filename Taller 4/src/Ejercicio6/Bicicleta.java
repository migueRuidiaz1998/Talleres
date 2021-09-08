
package Ejercicio6;

/**
 *
 * @author Jorge Miguel
 */
public class Bicicleta {
  
    private int velocidadActual;
    private int platoactual;
    private int pinonactual;

    public Bicicleta() {
    }

    public Bicicleta(int velocidadActual, int platoactual, int pinonactual) {
        this.velocidadActual = velocidadActual;
        this.platoactual = platoactual;
        this.pinonactual = pinonactual;
    }

    public int getVelocidadActual() {return velocidadActual;}
    public int getPlatoactual() {return platoactual;}
    public int getPinonactual() {return pinonactual;}

    public void setVelocidadActual(int velocidadActual) {this.velocidadActual = velocidadActual;}
    public void setPlatoactual(int platoactual) {this.platoactual = platoactual;}
    public void setPinonactual(int pinonactual) {this.pinonactual = pinonactual;}
    
    
    public int acelerar(){
    
    return 2*this.velocidadActual;
    }
    
    
    public int frenar(){
    
    return this.velocidadActual/2;
    }
    
    
    
    public int cambiarPlato(int plato){
    this.platoactual=plato;
     
    return plato;
    }
    
    
  public int cambiarPinon(int pinon){
    this.pinonactual=pinon;
     
    return pinon;
    }      

}
