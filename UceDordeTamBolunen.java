import java.util.Scanner;
public class UceDordeTamBolunen {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int sayi,sum1=0,adet=0;
        double ort;

        System.out.println("Bir sayi giriniz: ");
        sayi=inp.nextInt();

        for(int i=0;i<sayi;i++){
            if((i%3==0) && (i%4==0)){
                sum1+=i;
                adet++;
            }
        }
        //System.out.println("adet: "+adet+" sum: "+sum1);
        System.out.println("Verilen kurala gore ortalama: "+sum1/adet);
    }

}
