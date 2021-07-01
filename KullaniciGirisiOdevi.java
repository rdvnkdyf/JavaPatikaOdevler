import java.util.Scanner;
public class KullaniciGirisiOdevi {
 public static void main(String[] args){
     String userName,password,select;
     Scanner inp=new Scanner(System.in);
     
     System.out.println("Kullanici adiniz: ");
     userName=inp.nextLine();
     System.out.println("Sifrenizi giriniz: ");
     password=inp.nextLine();

     if(password.equals("ridvan")){
         System.out.println("Giris yaptiniz");
     }else{
         System.out.println("Sifrenizi sıfırlamak istiyor musunuz? e-h");
         select=inp.nextLine();
         if(select.equals("e")){
             String newPassword;
             System.out.println("Yeni şifrenizi giriniz:");
             newPassword=inp.nextLine();
             if(newPassword.equals("ridvan")){
                 System.out.println("Sifre oluşturulamadı");
                 System.out.println("Şifreyi tekrar giriniz:");
                 password=inp.nextLine();
             }else{
                System.out.println("Sifreniz oluşturuldu");
             }
         }else{
             System.out.println("O zaman programa tekrar giriş yapınız: ");
         }
     }

 }    
}
