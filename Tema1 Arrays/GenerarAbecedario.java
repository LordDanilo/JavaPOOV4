public class GenerarAbecedario{
    public char[] recorridoClasicoIzqDer(){
        char [] abecedario = new char[26];
        char letra = 'A';
        for(int pos=0; pos < abecedario.length; pos++){
            abecedario[pos] = letra;
            letra++;
        }
        imprimirArray(abecedario);
        return abecedario;
    }
    public void imprimirArray(char[] arr){
        for(int pos=0; pos<arr.length; pos++){
            char actual = arr[pos];
            System.out.print(actual+" ");
        }
    }
}
