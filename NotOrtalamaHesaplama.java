import java.util.Scanner;
public class NotOrtalamaHesaplama {
    public static void main(String[] args) {
       //Degiskenleri oluştur
       int mat,fizik,kimya,turkce,tarih,muzik;

       //Scanner sınıfını tanımladık
        Scanner inp=new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik notu: ");
        mat=inp.nextInt();

        System.out.print("Fizik notu: ");
        fizik=inp.nextInt();

        System.out.print("Kimya notu: ");
        kimya=inp.nextInt();

        System.out.print("Turkce notu: ");
        turkce=inp.nextInt();

        System.out.print("Tarih notu: ");
        tarih=inp.nextInt();

        System.out.print("Muzik notu: ");
        muzik=inp.nextInt();

        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double sonuc=toplam/6;
        //Ternary operator using 
        String ogrenci_bilgisi=(sonuc>60)?"Gectiniz":"Kaldiniz";
        System.out.println(ogrenci_bilgisi+"\tOrtlamanız:"+sonuc);
    }
}