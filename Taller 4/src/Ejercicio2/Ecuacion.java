
package Ejercicio2;

/**
 *
 * @author Jorge Miguel
 */
public class Ecuacion {
    
    private int a;
    private int b;
    private int c;
    private int x;

    public Ecuacion() {
    }

    public Ecuacion(int a, int b, int c, int x) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x = x;
    }

    public int getA() {return a;}
    public int getB() {return b;}
    public int getC() {return c;}
    public int getX() {return x;}

    public void setA(int a) {this.a = a;}
    public void setB(int b) {this.b = b;}
    public void setC(int c) {this.c = c;}
    public void setX(int x) {this.x = x;}
    
    
    public int imprimirY(){
    int y =0;
     y =(a*x)*(a*x) + b*x + c ;
    
    return y;
    }
    
    
    
    
    
    
    
}
