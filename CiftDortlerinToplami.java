import java.util.Scanner;
public class CiftDortlerinToplami {
public static void main(String[]args){
    Scanner inp=new Scanner(System.in);

    int sayi,sum=0;

    
 
     do{
        System.out.println("Bir sayi giriniz: ");
        sayi=inp.nextInt();
        if((sayi%2==0)&& (sayi%4==0)){
            sum+=sayi;
        }
     }while(sayi%2!=1);

     System.out.println("Toplam: "+sum);
}    
}
