public class EjemploMatriz{
    public char[][] generarAbecedario(){
        char[][] mat = new char[5][5];
        char letra = 'a';
        for(int fila=0; fila<mat.length; fila++){
            for(int col=0; col<mat[fila].length; col++){
                mat[fila][col] = letra;
                letra++;
            }
        }
        return mat;
    }
}
