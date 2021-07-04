import java.util.Scanner;
public class MaxMinBulma {
public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       int max,min,number1,number2,number3,number4;
       
       System.out.println("1.Sayiyi giriniz. ");
       number1=scan.nextInt();
       System.out.println("2.Sayiyi giriniz. ");
       number2=scan.nextInt();
       System.out.println("3.Sayiyi giriniz. ");
       number3=scan.nextInt();
       System.out.println("4.Sayiyi giriniz. ");
       number4=scan.nextInt();
       
       //MAX BULMA 
       max=number1;
       if (number2>max) max=number2;
       if (number3>max) max=number3;
       if (number4>max) max=number4;

       System.out.println("Max: "+max);
       
       //MİN BULMA 
       min=number1;
       if (number2<min) min=number2;
       if (number3<min) min=number3;
       if (number4<min) min=number4;

       System.out.println("Min: "+min);
}   
}
