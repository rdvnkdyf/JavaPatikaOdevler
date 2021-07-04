import java.util.Scanner;
public class AraliktaAsalSayiBulma {
public static void main(String[] args){
       
        Scanner tara=new Scanner(System.in);
        //int sayi=tara.nextInt();
        
        for(int j=1;j<100;j++){
          
        if(j==1){
            System.out.println("1 den buyuk sayilar, asal sayi olabilir");
            continue;
        }
        else if(j==2){
            System.out.println(j+"\t");
            continue;
        }
        else{
            int sayac = 0;
            for(int i=1;i<=j;i++){
                
                int kalan=j%i;
                if(kalan==0){
                sayac++;
            }
            }
                if(sayac==2){
                    System.out.println(j+" Sayi asaldir");
                }
                else{
                   continue;
                }
        }
        
        }
}    
}
