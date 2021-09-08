
package Ejercicio8;

/**
 *
 * @author Jorge Miguel
 */
public class Libro {
   
    private String título;
    private String primernombre;
    private String segundonombre;
    private String primerapellido;
    private String ISBN;
    private String páginas;
    private String edición;
    private String editorial;
    private String ciudad; 
    private String país;
    private String  fechadedición;

    public Libro() {
    }

    public Libro(String título, String primernombre, String segundonombre, String primerapellido, String ISBN, String páginas, String edición, String editorial, String ciudad, String país, String fechadedición) {
        this.título = título;
        this.primernombre = primernombre;
        this.segundonombre = segundonombre;
        this.primerapellido = primerapellido;
        this.ISBN = ISBN;
        this.páginas = páginas;
        this.edición = edición;
        this.editorial = editorial;
        this.ciudad = ciudad;
        this.país = país;
        this.fechadedición = fechadedición;
    }

    public String getTítulo() {return título;}
    public String getPrimernombre() {return primernombre; }
    public String getSegundonombre() {return segundonombre;    }
    public String getPrimerapellido() {return primerapellido; }
    public String getISBN() {return ISBN;}
    public String getPáginas() {return páginas; }
    public String getEdición() {return edición;}
    public String getEditorial() { return editorial; }
    public String getCiudad() { return ciudad;}
    public String getPaís() { return país;}
    public String getFechadedición() { return fechadedición;}

    public void setTítulo(String título) {this.título = título;  }
    public void setPrimernombre(String primernombre) {this.primernombre = primernombre;}
    public void setSegundonombre(String segundonombre) {this.segundonombre = segundonombre;}
    public void setPrimerapellido(String primerapellido) {this.primerapellido = primerapellido;}
    public void setISBN(String ISBN) {this.ISBN = ISBN;}
    public void setPáginas(String páginas) {this.páginas = páginas;}
    public void setEdición(String edición) {this.edición = edición;}
    public void setEditorial(String editorial) {this.editorial = editorial;}
    public void setCiudad(String ciudad) {this.ciudad = ciudad;}
    public void setPaís(String país) { this.país = país;}
    public void setFechadedición(String fechadedición) {this.fechadedición = fechadedición;}
    
    
    
    
    
    
    
    
    
    
    
    
}
