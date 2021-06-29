import java.util.Scanner;
import java.lang.Math;
public class UcgenAlanHesaplama {
    public static void main(String[] args){
        double cevre,alan,u;
        int birincikenar,ikincikenar,ucuncukenar;
        Scanner giris=new Scanner(System.in);

        
        System.out.println("1. kenarı giriniz: ");
        birincikenar=giris.nextInt();

        System.out.println("2. kenarı giriniz: ");
        ikincikenar=giris.nextInt();
        
        System.out.println("3. kenarı giriniz: ");
        ucuncukenar=giris.nextInt();

        cevre=birincikenar+ikincikenar+ucuncukenar;
        u=cevre/2;
        alan=Math.pow((u*(u-birincikenar)*(u-ikincikenar)*(u-ucuncukenar)),0.5);
        
        System.out.println("3 kenarları verilen ücgenin alanı: "+alan);


    }
}
