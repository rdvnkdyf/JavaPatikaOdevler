import java.util.Scanner;
public class RecursiveAsalSayiBulma {
    public static boolean isPrime(int n,int i){
        if(n<=2)
          return (n==2) ? true:false;
        
        if(n%i==0)
          return false;
        
        if(i*i>n)
           return true;
        
        return isPrime(n, i+1);
        
    }
    public static void main(String[] args){
      Scanner scan=new Scanner(System.in);
      int number;

      System.out.println("Sayi giriniz: ");
      number=scan.nextInt();
      boolean result;
      result=isPrime(number,2);
      if(result)
          System.out.println(number+" ASAL sayıdır.");
      else 
        System.out.println(number+" ASAL sayı değildir.");
    }  
}
