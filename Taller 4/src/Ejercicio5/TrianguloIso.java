
package Ejercicio5;

/**
 *
 * @author Jorge Miguel
 */
public class TrianguloIso {
  
    private double base;
    private double altura;

    public TrianguloIso() {
    }

    public TrianguloIso(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {return base;}
    public double getAltura() {return altura;}

    public void setBase(double base) {this.base = base; }
    public void setAltura(double altura) {this.altura = altura;}
    
    
    
    
    
    public double CalcurArea(){
    
    
    return (this.base*this.altura)/2;
    }
    
    public double CalcularLados(){
    double lad=0;
    lad =Math.sqrt((base/2)*(base/2)+ altura*altura);
    
    
    return lad;
    }
    
    
    public double CalcularPerimetro(){
        
   
    return (2*CalcularLados()+base);
    }
    
    
    
    
    
    
}
