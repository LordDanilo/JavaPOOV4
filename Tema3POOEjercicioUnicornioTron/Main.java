import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        UnicornioTron juego = new UnicornioTron();
        juego.setPremio(500);
        juego.agregarFichas(10);
        while(juego.getFichas()>0){
            int intento = sc.nextInt();
            String res = juego.jugar(intento);
            System.out.print(res);
        }
    }
}
