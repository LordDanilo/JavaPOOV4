public class Ejemplo{
    public int contarVocales(String cad){
        cad = cad.toLowerCase();
        int contadorVocales = 0;
        for(int pos=0; pos<cad.length(); pos++){
            char actual = cad.charAt(pos);
            if(esVocal(actual)){
                contadorVocales++;
            }
        }
        return contadorVocales;
    }
    private boolean esVocal(char letra){
        return letra=='a' || letra=='e' || letra =='i' || letra == 'o' || letra=='u';
    }
}
