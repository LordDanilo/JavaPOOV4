public class UnicornioTron{
    private int premio;
    private int fichas;
    private int numSecreto;
    
    public UnicornioTron(){
        premio = 0;
        fichas = 0;
        numSecreto = (int)((Math.random()*9999)+1000);
    }
    public String jugar(int numCandidato){
        String res = "";
        if(premio>0){
            if(fichas>0){
                fichas--;
                if(numSecreto == numCandidato){
                    res = "Felicidades, ganaste!!! Tu premio es de "+premio;
                    premio = 0;
                    numSecreto = (int)((Math.random()*9999)+1000);
                }else{
                    res = "Fallaste, sigue participando...";
                }
            }else{
                res = "Error, no tienes fichas para jugar";
            }
        }else{
            res = "Error, no hay premio disponible";
        }
        return res;
    }
    public void agregarFichas(int cantidad){
        fichas = fichas+cantidad;
    }
    public int getFichas(){
        return fichas;
    }
    public int consultarPremio(){
        return premio;
    }
    public void setPremio(int cantidad){
        premio = cantidad;
    }
}
