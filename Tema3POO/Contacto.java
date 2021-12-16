public class Contacto{
    // instance variables - replace the example below with your own
    private String nombre;
    private int numeroCelular;
    private boolean esFamiliar;
    private final static String CODIGO = "+591";

    /**
     * Constructor for objects of class Contacto
     */
    public Contacto(String nombre, int numCel){
        this.nombre   = nombre;
        numeroCelular = numCel;
        esFamiliar    = false;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getNumeroCelular(){
        return numeroCelular;
    }
    public boolean getEsFamiliar(){
        return esFamiliar;
    }
    
    public void setNombre(String valor){
        nombre = valor;
    }
    public void setNumeroCelular(int valor){
        numeroCelular = valor;
    }
    public void setEsFamiliar(boolean valor){
        esFamiliar = valor;
    }
}
