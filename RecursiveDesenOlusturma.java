import java.util.Scanner;
public class RecursiveDesenOlusturma {
    public static void recursiveDesen(int N){
        
        if (N==0 || N<0){
            System.out.printf("%d ", N);
            N+=5;
            
            return;
        }
        else if(N!=0 || N>0) {
                System.out.printf("%d ", N);
      
                
                recursiveDesen(N - 5);
      
                System.out.printf("%d ", N);
                return;
            }
        if(N==0){
            System.out.printf("%d ", N);
        }
        if(N<0){
            System.out.printf("%d ", N);
            recursiveDesen(N+5);
        }
    }
         
       
         
    
 public static void main(String[] args){
     Scanner scan=new Scanner(System.in);
     int number;
     System.out.println("N Sayısı: ");
     number=scan.nextInt();
     recursiveDesen(number);

 }    
}
