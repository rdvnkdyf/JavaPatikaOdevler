import java.util.Scanner;
public class BasamakSayilarininToplami {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num;

        System.out.println("Sayıyı giriniz: ");
        num=inp.nextInt();
        
        int toplam=0;
 
        while(num != 0)
        {
           toplam=(num%10)+toplam;
           num /= 10;
        }
       
        System.out.println("Basamak Toplamı: " + toplam);
    } 
}
