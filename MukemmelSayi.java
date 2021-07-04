import java.util.Scanner;
public class MukemmelSayi {
public static void main(String[]args){
    Scanner inp=new Scanner(System.in);
    int sayi,toplam=0;
    System.out.println("Sayiyi giriniz. ");
    sayi=inp.nextInt();

   for(int i=1;i<sayi;i++){
       if(sayi%i==0){
          toplam+=i;
       }

   }
   if(sayi==toplam)
            System.out.println(sayi+" Mükemmel sayidir. ");
   else 
            System.out.println(sayi+" Mükemmel sayi degildir ");
}    
}
