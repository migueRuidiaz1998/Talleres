
package Ejercicio4;

/**
 *
 * @author Jorge Miguel
 */
public class Coche {
    private String color;
    private String marca;
    private int modelo;
    private int NoCaballo;
    private int NoPuertas;
    private String matricula;


    public Coche() {
      this.color = "Amarillo";
        this.marca = "Chew";
        this.modelo = 2021;
        this.NoCaballo = 1;
        this.NoPuertas = 2;
        this.matricula = "JJFG";
    
    }

    public Coche(String color, String marca, int modelo, int NoCaballo, int NoPuertas, String matricula) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.NoCaballo = NoCaballo;
        this.NoPuertas = NoPuertas;
        this.matricula = matricula;
    }

    
    

    
    
    public String getColor() {return color;}
    public String getMarca() {return marca;}
    public int getModelo() {return modelo;}
    public int getNoCaballo() {return NoCaballo; }
    public int getNoPuertas() {return NoPuertas;}
    public String getMatricula() {return matricula;}

    public void setColor(String color) {this.color = color;}
    public void setMarca(String marca) {this.marca = marca;}
    public void setModelo(int modelo) {this.modelo = modelo;}
    public void setNoCaballo(int NoCaballo) {this.NoCaballo = NoCaballo;}
    public void setNoPuertas(int NoPuertas) {this.NoPuertas = NoPuertas;}
    public void setMatricula(String matricula) { this.matricula = matricula;}
    
    
    
    
    
}
