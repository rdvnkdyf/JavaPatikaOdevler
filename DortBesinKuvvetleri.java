import java.util.Scanner;
public class DortBesinKuvvetleri {
 public static void main(String[] args){
     Scanner inp=new Scanner(System.in);

     int n;
     
     System.out.println("Bir aralık giriniz: ");
     n=inp.nextInt();
     
     //4 ün katlarını yazdırma 
     System.out.println("4 ün katlarını yazdırma");
     for(int i=1;i<=n;i*=4){
         System.out.println(i);
     }
     
      //5 in  katlarını yazdırma 
      System.out.println("5 in katlarını yazdırma");
     for(int i=1;i<=n;i*=5){
        System.out.println(i);
    }
 }   
}
