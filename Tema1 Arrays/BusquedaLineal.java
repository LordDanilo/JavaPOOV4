public class BusquedaLineal{
    public int buscar(int buscado, int[] arr){
        int res = -1;
        for(int pos=0; pos<arr.length && res==-1; pos++){
            if(arr[pos] == buscado){
                res = pos;
            }
        }
        return res;
    }
}
