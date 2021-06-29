import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double kilo,boy,indexResult;
        System.out.println("Kilonuzu giriniz:(Kilogram cinsinden) ");
        kilo=input.nextDouble();
        System.out.println("Boyunuzu giriniz:(Metre cinsinden) ");
        boy=input.nextDouble();

        indexResult=kilo/(boy*boy);
        System.out.println("Vucüt Kitle İndeksiniz: "+indexResult);
    }
}
