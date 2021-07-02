import java.util.Scanner;
public class UcakBiletFiyatHesaplama{
    public static void main(String[]args){
       Scanner inp=new Scanner(System.in);
       int mesafe,yas,yolculuk_tipi;
       double normal_tutar,yas_indirimi,indirimli_tutar,cift_donus_indirim,sum_price;
       /*
       İSTENİLENE GORE HATALI OLABILIR
       */
       System.out.println("Mesafeyi giriniz: ");
       mesafe=inp.nextInt();

       System.out.println("Yasi giriniz: ");
       yas=inp.nextInt();

       System.out.println("Yolculuk tipini giriniz: \t1-Tek yön\t2-Gidiş-Dönüş");
       yolculuk_tipi=inp.nextInt();

       if((0<mesafe && 0<yas) &&(yolculuk_tipi==1 || yolculuk_tipi==2)){
            if(yolculuk_tipi==1){
                  if(12<yas){
                    normal_tutar=mesafe*0.10;
                    yas_indirimi=normal_tutar*0.50;
                    indirimli_tutar=normal_tutar-yas_indirimi;
                    sum_price=indirimli_tutar;
                    System.out.println("Toplam fiyat: "+sum_price);
                  }else if(12<yas && 24<yas){
                    normal_tutar=mesafe*0.10;
                    yas_indirimi=normal_tutar*0.10;
                    indirimli_tutar=normal_tutar-yas_indirimi;
                    sum_price=indirimli_tutar;
                    System.out.println("Toplam fiyat: "+sum_price);
                  }else if(65<yas){
                    normal_tutar=mesafe*0.10;
                    yas_indirimi=normal_tutar*0.30;
                    indirimli_tutar=normal_tutar-yas_indirimi;
                    sum_price=indirimli_tutar;
                    System.out.println("Toplam fiyat: "+sum_price);
                  }
            }else if(yolculuk_tipi==2){
                if(12<yas){
                    normal_tutar=mesafe*0.10;
                    yas_indirimi=normal_tutar*0.50;
                    indirimli_tutar=normal_tutar-yas_indirimi;
                    cift_donus_indirim=indirimli_tutar*0.20;
                    sum_price=(indirimli_tutar-cift_donus_indirim)*2;
                    System.out.println("Toplam fiyat: "+sum_price);
                }else if(12<yas && 24<yas){
                    normal_tutar=mesafe*0.10;
                    yas_indirimi=normal_tutar*0.10;
                    indirimli_tutar=normal_tutar-yas_indirimi;
                    cift_donus_indirim=indirimli_tutar*0.20;
                    sum_price=(indirimli_tutar-cift_donus_indirim)*2;
                    System.out.println("Toplam fiyat: "+sum_price);
                }else if(65<yas){
                    normal_tutar=mesafe*0.10;
                    yas_indirimi=normal_tutar*0.30;
                    indirimli_tutar=normal_tutar-yas_indirimi;
                    cift_donus_indirim=indirimli_tutar*0.20;
                    sum_price=(indirimli_tutar-cift_donus_indirim)*2;
                    System.out.println("Toplam fiyat: "+sum_price);
                }
            }

       }else{
        System.out.println("Hatalı giriş yaptınız...");  
       }


    }
}