public class Heroe extends UnidadDeJuego{
    private int defensa;
    public Heroe(int defensa, int hp, int atq){
        setHitPoints(hp);
        setAtaque(atq);
        setLevel(1);
        this.defensa = defensa;
    }
    public void aumentarValor(int power){
        int varAtaque = getAtaque();
        if(varAtaque > 10){
            setAtaque(power+varAtaque);
        }
    }
}
