
package Ejercicio7;

/**
 *
 * @author Jorge Miguel
 */
public class Producto {
  
    private int codigo;
    private String nombre;
    private double precioCompra;
    private int porutilidad;

    public Producto() {
    }

    public Producto(int codigo, String nombre, double precioCompra, int porutilidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.porutilidad = porutilidad;
    }

    public int getCodigo() {return codigo;}
    public String getNombre() {return nombre;}
    public double getPrecioCompra() {return precioCompra;}
    public int getPorutilidad() {return porutilidad;}

    public void setCodigo(int codigo) {this.codigo = codigo;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setPrecioCompra(double precioCompra) {this.precioCompra = precioCompra;}
    public void setPorutilidad(int porutilidad) {this.porutilidad = porutilidad;}
    
    
    public double precioVenta(){
    
       double utili=this.porutilidad/100;
       
        return precioCompra/utili;
    
    }
    
    
    
    
    
    
    
    
}
