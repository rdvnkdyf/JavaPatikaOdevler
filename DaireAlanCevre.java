import java.util.Scanner;
import java.lang.Math;
public class DaireAlanCevre {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double r,alan,cevre;
        System.out.println("Dairenin yarıcapını giriniz: ");
        r=input.nextDouble();
       
        alan=Math.PI*r*r;
        cevre=2*Math.PI*r;
             
        System.out.println("Dairenin alani:"+alan);
        System.out.println("Dairenin cevresi:"+cevre);
       

    } 
}
