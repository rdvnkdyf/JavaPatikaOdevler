import java.util.Scanner;
public class EbobEkok {
 public static void main(String[]args){
     Scanner inp=new Scanner(System.in);
     System.out.println("n1 sayısını giriniz: ");
     int n1=inp.nextInt();

     System.out.println("n2 sayısını giriniz: ");
     int n2=inp.nextInt();
     int i=1;
     //EKOK U BULMA 
     while(i<=(n1*n2)){
        if(i%n1==0 && i%n2==0){
            System.out.println(i);
            break;
        }
        i++;
     }
     //EBOB'U BULMA 
     /*
     int ebob=1,i=1;
      //ebob u bulma 
     while(i<=n1){
       if(n1%i==0 && n2%i==0){
           ebob=i;
       }
        i++;
     }
    
     
     int k=n1; 
     while(k>=1){
        if(n1%k==0 && n2%k==0){
            ebob=k;
        } 
        k--;
     }*/
 }    
}
