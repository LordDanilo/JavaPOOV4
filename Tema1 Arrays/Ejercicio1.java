public class Ejercicio1{
    public String hallarVortice(int[] arr){
        String res = "El Vortice esta formado por los numeros";
        int numMayor = arr[0];
        int numMenor = arr[0];
        int posMayor = 0;
        int posMenor = 0;
        for(int pos = 1; pos<arr.length; pos++){
            int actual = arr[pos];
            if(actual > numMayor){
                numMayor = actual;
                posMayor = pos;
            }else{
                if(actual < numMenor){
                    numMenor = actual;
                    posMenor = pos;
                }
            }
        }
        int posInicial = Math.min(posMayor, posMenor);
        int posFinal   = Math.max(posMayor, posMenor);
        
        for(int pos = posInicial; pos<=posFinal; pos++){
            int actual = arr[pos];
            res = res+" "+actual;
        }
        return res;
    }
}
