import java.util.Scanner;
public class TersUcgen {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int rows,i,j,space;

        System.out.println("Satır sayısını giriniz: ");
        rows=inp.nextInt();
        for (i=rows; i>=1; --i) {
            for (space=0; space<rows-i; ++space)
                   System.out.print("  ");
            for (j=i; j<=2*i-1; ++j)
                  System.out.print("* ");
            for (j=0; j<i-1; ++j)
                  System.out.print("* ");
            System.out.print("\n");
        }
    }   
}
