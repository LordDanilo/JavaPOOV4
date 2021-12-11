import java.util.Arrays;
public class BusquedaAPI{
    public int buscar(int buscado, int[]arr){
        Arrays.sort(arr);
        int res = Arrays.binarySearch(arr,buscado);
        return res;
    }
}
