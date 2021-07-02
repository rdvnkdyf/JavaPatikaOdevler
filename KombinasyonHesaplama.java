import java.util.Scanner;
public class KombinasyonHesaplama {
 public static void main(String[] args){
     int faktn=1,faktr=1,faktneksir=1;
     int n,r;
     double com=1;
     Scanner inp=new Scanner(System.in);

     System.out.println("n'i giriniz: ");
     n=inp.nextInt();

     System.out.println("r'i giriniz: ");
     r=inp.nextInt();

     //n faktoriyeli hesaplama 
       for (int i=1;i<=n;i++){
           faktn*=i;
       }
      System.out.println("faktn : "+faktn);
     //r faktoriyeli hesaplama 
     for (int i=1;i<=r;i++){
        faktr*=i;
    }
    System.out.println("faktr : "+faktr);
     //n-r faktoriyeli hesaplama 
     for (int i=1;i<=(n-r);i++){
        faktneksir*=i;
    }
    System.out.println("faktneksir "+faktneksir);
     //kombinasyon sonucu 
     com=faktn/(faktr*faktneksir);
     System.out.println("Kombinasyon'un sonucu: "+com);
 }    
}
