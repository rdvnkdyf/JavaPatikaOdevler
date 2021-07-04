import java.util.Scanner;
public class FibonacciSeri {
    public static void main(String[] args){
        int N=9;
        int num1 = 0, num2 = 1;
        
        int counter = 0;
  
        // Iterate till counter is N
        while (counter < N) {
             // Swap
            int num3 = num2 + num1;
            System.out.println(num1+" "+num2);
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }    
}
