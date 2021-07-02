import java.util.Scanner;
public class ManuelUsluHesaplama {
public static void main(String[] args){
    Scanner inp=new Scanner(System.in);
    int alt_taban,ust_taban,carpim=1;

    System.out.println("alt_taban 'i giriniz: ");
    alt_taban=inp.nextInt();

    System.out.println("ust_taban'i giriniz: ");
    ust_taban=inp.nextInt();

    for(int i=1;i<=ust_taban;i++){
        carpim*=alt_taban;
    }
  
    System.out.println("alt_taban "+alt_taban+" üzeri"+ust_taban+"="+carpim);
    
}    
}
