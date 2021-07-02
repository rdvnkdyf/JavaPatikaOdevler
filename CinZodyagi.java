import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int dogum_tarih;
        
        System.out.println("Dogum tarihini giriniz: ");
        dogum_tarih=inp.nextInt();

        if(dogum_tarih%12==0){
            System.out.println("Maymun");
        }else if(dogum_tarih%12==1){
            System.out.println(" Horoz");
        }else if(dogum_tarih%12==2){
            System.out.println("Köpek");
        }else if(dogum_tarih%12==3){
            System.out.println("Domuz");
        }else if(dogum_tarih%12==4){
            System.out.println("Fare");
        }else if(dogum_tarih%12==5){
            System.out.println("Öküz");
        }else if(dogum_tarih%12==6){
            System.out.println("Kaplan");
        }else if(dogum_tarih%12==7){
            System.out.println("Tavşan");
        }else if(dogum_tarih%12==8){
            System.out.println("Ejderha");
        }else if(dogum_tarih%12==9){
            System.out.println(" Yılan");
        }else if(dogum_tarih%12==10){
            System.out.println("At");
        }else if(dogum_tarih%12==11){
            System.out.println("Koyun");
        }
    }
}
