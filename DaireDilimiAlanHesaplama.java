import java.util.Scanner;
public class DaireDilimiAlanHesaplama {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double r,aci,dilim_alan;
        
        System.out.println("Dairenin yarıcapını giriniz: ");
        r=input.nextDouble();
        System.out.println("Daire diliminin acisini giriniz: ");
        aci=input.nextDouble();

        dilim_alan=(3.14*(r*r)*aci)/360;
        System.out.println("Daire diliminin alanı: "+dilim_alan);
    }
}
