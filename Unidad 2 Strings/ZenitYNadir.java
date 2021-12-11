public class ZenitYNadir{
    public String invertir(String cad){
        String res = "";
        for(int pos=0; pos<cad.length(); pos++){
            char actual = cad.charAt(pos); //arr[pos]
            res = actual+res;
        }
        return res;
    }
    public String invertir2(String cad){
        StringBuilder res = new StringBuilder(cad);
        res = res.reverse();
        return res.toString();
    }
}
