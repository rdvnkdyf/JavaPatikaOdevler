import java.util.Scanner;
public class ArtikYil {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);

        int yil;
        boolean artik_durum=false;

        System.out.println("Yili giriniz: ");
        yil=inp.nextInt();

        if(yil%4==0){
            if(yil%100==0){
                if(yil%400==0){
                    artik_durum=true;
                }else{
                    artik_durum=false;
                }
            }else{
                artik_durum=true;
            }
        }else{
            artik_durum=false;
        }

        if(artik_durum)
            System.out.println(yil + " artık yıldır.");
        else
            System.out.println(yil + " artık yıl değildir.");
    }
}
