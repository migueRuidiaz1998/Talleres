
package Ejercicio1;

/**
 *
 * @author Jorge Miguel
 */
public class Rectangulo {
    
    private double longitud;
    private double ancho;

    public Rectangulo() {
    }

    public Rectangulo(double longitud, double ancho) {
        this.longitud = 24;
        this.ancho = 12;
    }

    
    
    
    public double getLongitud() { return longitud;}
    public void setLongitud(double longitud) {this.longitud = longitud; }
    public double getAncho() {return ancho;}
    public void setAncho(double ancho) {this.ancho = ancho;
    }
    
    public double calcularArea(){
        return this.longitud * this.ancho;
    }
    
    public double calcularPerimetro(){
        return 2*(this.longitud + this.ancho);
    }
    
    
    
    
    
    
}
