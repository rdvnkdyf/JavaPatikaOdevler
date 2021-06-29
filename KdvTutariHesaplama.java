import java.util.Scanner;
public class KdvTutariHesaplama {
    public static void main(String[] args){
        double tutar,kdvOran=0.18,kdvTutar,kdvliTutar;
        Scanner inp=new Scanner(System.in);
        System.out.print("Ucret Tutarını giriniz:");
        tutar=inp.nextDouble();
        kdvOran=(0<tutar && tutar<1000)?0.18:0.08;
        kdvTutar=tutar*kdvOran;
        kdvliTutar=tutar+kdvTutar;

        System.out.println("Kdvsiz Tutar: "+tutar);
        System.out.println("KDV oranı: "+kdvOran);
        System.out.println("KDV tutarı: "+kdvTutar);
        System.out.println("kdvlitutar: "+kdvliTutar);

    }
}
