import java.util.Scanner;
import java.lang.Math;
public class DikUcgendeHipotenusBulma {
    public static void main(String [] args){
        int birincikenar,ikincikenar;
        double hipo;
        Scanner giris=new Scanner(System.in);

        System.out.println("1.Dik kenarı giriniz: ");
        birincikenar=giris.nextInt();
         
        System.out.println("2.Dik kenarı giriniz: ");
        ikincikenar=giris.nextInt();

        hipo=Math.pow((birincikenar*birincikenar)+(ikincikenar*ikincikenar),0.5);
        System.out.println("Hipotenüs: "+(int)hipo);
    }
}
