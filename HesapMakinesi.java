import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[]args){
        int n1,n2,select;
        Scanner input=new Scanner(System.in);

        System.out.println("1.Sayıyı giriniz: ");
        n1=input.nextInt();
        System.out.println("2.Sayıyı giriniz: ");
        n2=input.nextInt();
        System.out.println("Hangi İşlemi yapmak istiyorsanız onu secin:('\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme')");
        select=input.nextInt();
        
        //secimi kontrol ediyorum
        if(0<select && select<5){
            switch(select){
                case 1:
                      System.out.println("1.sayı"+n1+" + "+" 2.sayı "+n2+"="+(n1+n2));
                      break;
                
                case 2:
                      System.out.println("1.sayı"+n1+" - "+"2.sayı "+n2+"="+(n1-n2));
                      break;
                case 3:
                      System.out.println("1.sayı"+n1+" * "+"2.sayı "+n2+"="+(n1*n2));
                      break;
                
                case 4:
                      if(n2!=0){
                        System.out.println("1.sayı"+n1+" / "+"2.sayı "+n2+"="+(n1/n2));
                      }
                      break;
                
                }
        }else{
            System.out.println("Hangi İşlemi yapmak istiyorsanız onu secin:('\n1-Toplama\n2-Çıkarma\n3-Çarma\n4-Bölme')");
        select=input.nextInt();
        }

    }
}
