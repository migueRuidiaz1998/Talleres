
package Ejercicio3;

/**
 *
 * @author Jorge Miguel
 */
public class Habitacion {
 
   private double largo;
   private double ancho; 
   private double altura;

    public Habitacion() {
    }

    public Habitacion(double largo, double ancho, double altura) {
        this.largo = largo;
        this.ancho = ancho;
        this.altura = altura;
    }

    public double getLargo() {return largo;}
    public double getAncho() {return ancho;}
    public double getAltura() {return altura;}

    public void setLargo(double largo) {this.largo = largo;}
    public void setAncho(double ancho) {this.ancho = ancho;}
    public void setAltura(double altura) {this.altura = altura;    }
    
    
    double  calcularMetros(){
    
        double mc=0;
    mc = largo*ancho;
    
    return mc;
    }
    
    
    double  calcularPapel(){
    
    double mp = 0; double habi=0; 
    double mp1 = 0;
    mp = ancho * altura;
    mp1 = largo * ancho;
    habi = mp/mp1;
    return habi;
    }
    
    
    
}
