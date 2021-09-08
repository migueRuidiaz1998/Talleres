
package Ejercicio8;

/**
 *
 * @author Jorge Miguel
 */
public class TestLibro {
    public static void main(String[] args) {
        
       Libro n = new Libro("Introduction to Java Programming", "Y.", "Daniel", " Liang, ", "0-13-031997-x", "784", "3a. ", "Prentice-Hall", "New Jersey", "(USA)", "Viernes 16 de noviembre 2001");
        mostrarInfoLibro(n);
       
        
       Libro m = new Libro(); 
      leerLibro(m);
      mostrarInfoLibro(m); 
        
        
    }
    
   
   
    
      public static void leerLibro(Libro x){
    x.setTítulo("Harry Potter");
    x.setPrimernombre("Luis");
    x.setSegundonombre("Salazar ");
    x.setPrimerapellido("Slicerin ");
    x.setISBN("0-13-031997-x");
    x.setPáginas("800");
    x.setEdición("2a");
    x.setEditorial("Prentice-Hall");
    x.setCiudad("Valledupar ");
    x.setPaís("Colombia");
    x.setFechadedición("Viernes 16 de noviembre 2001");
    } 
      
    
    public static void mostrarInfoLibro(Libro l){
        System.out.println("Titulo: " + l.getTítulo());
        System.out.printf(l.getEdición()+"Edicion\n");
        System.out.println("Autor: " +l.getPrimerapellido()+l.getPrimernombre()+" "+l.getSegundonombre());
        System.out.println("ISBN: "+l.getISBN());
        System.out.println(l.getEditorial()+" "+l.getCiudad()+l.getPaís()+" "+l.getFechadedición());
        System.out.println(l.getPáginas()+" paginas");
        System.out.println("-----------------------------------");
    }
    
    
    
    
}
