import java.util.Scanner;
public class SinifGecmeDurumu{
    public static void main(String[] args){
        int mat,fizik,turkce,kimya,muzik;
        Scanner inp=new Scanner(System.in);
        
        System.out.println("Matematik notunuz: ");
        mat=inp.nextInt();
        if(0>mat || mat>100){
            mat=0;
        }
        System.out.println("Fizik notunuz: ");
        fizik=inp.nextInt();
        if(0>fizik || fizik>100){
            fizik=0;
        }
        System.out.println("Turkce notunuz: ");
        turkce=inp.nextInt();
        if(0>turkce || turkce>100){
            turkce=0;
        }
        System.out.println("Kimya notunuz: ");
        kimya=inp.nextInt();
        if(0>kimya || kimya>100){
            kimya=0;
        }
        System.out.println("Muzik notunuz: ");
        muzik=inp.nextInt();
        if(0>muzik || muzik>100){
           muzik=0;
        }
        double average=(mat+fizik+turkce+kimya+muzik)/5;
        if(average<=55){
            System.out.println("Sınıfta kaldınız.....Notunuz: "+average);
        }else{
            System.out.println("Gectiniz.....Notunuz: "+average);
        }
   
    }    
}