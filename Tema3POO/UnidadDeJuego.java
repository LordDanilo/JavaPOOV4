public abstract class UnidadDeJuego{
    private int hitPoints;
    private int ataque;
    private int level;
    public int getAtaque(){
        return ataque;
    }
    public void setAtaque(int valor){
        ataque = valor;
    }
    public void setHitPoints(int valor){
        hitPoints = valor;
    }
    public void setLevel(int valor){
        level = valor;
    }
}
