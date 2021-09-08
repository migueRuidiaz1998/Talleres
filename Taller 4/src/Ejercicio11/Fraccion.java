
package Ejercicio11;

/**
 *
 * @author Jorge Miguel
 */
public class Fraccion {
  private int numerador;
  private int denominador;

    public Fraccion() {
         this.numerador = 0;
        this.denominador = 1;
    }
    

    public Fraccion(int numerador, int denominador) {
       this.numerador = numerador;
        if(denominador==0){
            denominador = 1;
        }
        this.denominador = denominador;
        simplificar();
    }

    Fraccion(int i) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public int getNumerador() {return numerador;}
    public int getDenominador() {return denominador;}
    public void setNumerador(int numerador) {this.numerador = numerador;}
    public void setDenominador(int denominador) {this.denominador = denominador;}
  
  
   
    public Fraccion sumar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.numerador = this.numerador * f.denominador + this.denominador * f.numerador;
        aux.denominador = this.denominador * f.denominador;
        aux.simplificar();                                                     
        return aux;
    }
   
    //restar fracciones
    public Fraccion restar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.numerador = this.numerador * f.denominador - this.denominador * f.numerador;
        aux.denominador = this.denominador * f.denominador;
        aux.simplificar(); 
        return aux;
    }
   
 
    public Fraccion multiplicar(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.numerador = this.numerador * f.numerador;
        aux.denominador = this.denominador * f.denominador;
        aux.simplificar();  
        return aux;
    }

  
    public Fraccion dividir(Fraccion f) {
        Fraccion aux = new Fraccion();
        aux.numerador = this.numerador * f.denominador;
        aux.denominador = this.denominador * f.numerador;
        aux.simplificar();  
        return aux;
    }
   
                                                
    private int mcd() {
        int u = Math.abs(numerador); 
        int v = Math.abs(denominador); 
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

   
    private void simplificar() {
        int n = mcd();
        numerador = numerador / n;
        denominador = denominador / n;
    }

    @Override
    public String toString() {
        simplificar();
        return numerador + "/" + denominador;
    }    
    
    
    
    
} 
 
    
    
    
    

