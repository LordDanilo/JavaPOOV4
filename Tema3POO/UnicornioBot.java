public class UnicornioBot{
    private String nombreUsuario;
    public UnicornioBot(String nombre){
        nombreUsuario = nombre;
    }
    public String saludar(){
        String saludo = "Hola "+nombreUsuario;
        return saludo;
    }
    public void setNombreUsuario(String valor){
        nombreUsuario = valor;
    }
}
