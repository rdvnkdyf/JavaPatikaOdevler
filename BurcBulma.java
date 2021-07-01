import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args){
        int month,day;

        Scanner inp=new Scanner(System.in);
        
        System.out.println("Dogdunuz ay:");
        month=inp.nextInt();

        System.out.println("Dogdunuz gün:");
        day=inp.nextInt();

        if(month==1){
            if(22<=day){
                System.out.println("Kova");
            }else{
                System.out.println("Oglak");
            }
        }
        else if(month==2){
            if(20<=day){
                System.out.println("Balık");
            }else{
                System.out.println("Kova");
            }
        }
        else if(month==3){
            if(21<=day){
                System.out.println("Koç"); 
            }else{
                System.out.println("Balık");
            }
        }
        else if(month==4){
            if(21<=day){
                System.out.println("Boğa");
            }else{
                System.out.println("Koç"); 
            }
        }
        else if(month==5){
            if(22<=day){
                System.out.println("İkizler");
            }else{
                System.out.println("Boğa");
            }
        }
        else if(month==6){
            if(23<=day){
                System.out.println("Yengeç");
            }else{
                System.out.println("İkizler");
            }
        }
        else if(month==7){
            if(23<=day){
                System.out.println("Aslan");
            }else{
                System.out.println("Yengeç");
            }
        }
        else if(month==8){
            if(23<=day){
                System.out.println("Başak");
            }else{
                System.out.println("Aslan");
            }
        }
        else if(month==9){
            if(23<=day){
                System.out.println("Terazi");
            }else{
                System.out.println("Başak");
            }
        }
        else if(month==10){
            if(23<=day){
                System.out.println("Akrep");
            }else{
                System.out.println("Terazi");
            }
        }
        else if(month==11){
            if(22<=day){
                System.out.println("Yay");
            }else{
                System.out.println("Akrep");
            }
        }
        else if(month==12){
            if(22<=day){
                System.out.println("Oğlak");
            }else{
                System.out.println("Yay");
            }
        }
    }
}
