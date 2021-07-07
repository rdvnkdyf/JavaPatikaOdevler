import java.util.Scanner;
public class RecursiveUsluHesap {
    static int recursivePower(int taban,int ust){
        if (ust != 0) {

            // recursive call to power()
            return (taban * recursivePower(taban, ust - 1));
          }
          else {
            return 1;
          }
    }
 public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  int taban,ust;

  System.out.println("Taban degeri giriniz: ");
  taban=scan.nextInt();
  System.out.println("Üs degeri giriniz: ");
  ust=scan.nextInt();
  
  int result=recursivePower(taban, ust);
  System.out.println("Sonuç: "+result);
 }    
}
