import java.util.Scanner;
public class SayilariSiralama {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int say1,say2,say3;
        
        System.out.println("1.Sayiyi giriniz: ");
        say1=inp.nextInt();
        
        System.out.println("2.Sayiyi giriniz: ");
        say2=inp.nextInt();

        System.out.println("3.Sayiyi giriniz: ");
        say3=inp.nextInt();
   
     /*   //Büyükten Kücüge Sıralama
        //say1'in büyük olma durumu 
        if(say1>say3 && say1>say2){
            if(say3>say2){
                System.out.println("say1: "+say1+">say3: "+say3+" >say2: "+say2);
            }else{
                System.out.println("say1: "+say1+">say2: "+say2+" >say3: "+say3);
            }
        }
        //say2'in büyük olma durumu
        if(say2>say1 && say2>say3){
            if(say1>say3){
                System.out.println("say2: "+say2+">say1: "+say1+" >say3: "+say3);
            }else{
                System.out.println("say2: "+say2+">say3: "+say3+" >say1: "+say1);
            }
        }
        //say3'in büyük olma durumu
        if(say3>say1 && say3>say2){
            if(say1>say2){
                System.out.println("say3: "+say3+">say1: "+say1+" >say2: "+say2);
            }else{
                System.out.println("say3: "+say3+">say2: "+say2+" >say1: "+say1);
            }
        }
                */ 

        //Kücükten Büyüge 
        //say1'in  en küçük olma durumu 
        if(say1<say3 && say1<say2){
            if(say3<say2){
                System.out.println("say1: "+say1+"<say3: "+say3+" <say2: "+say2);
            }else{
                System.out.println("say1: "+say1+"<say2: "+say2+" <say3: "+say3);
            }
        }

        //say2'in  en küçük olma durumu 
        if(say2<say3 && say2<say1){
            if(say3<say1){
                System.out.println("say2: "+say2+"<say3: "+say3+" <say1: "+say1);
            }else{
                System.out.println("say2: "+say2+"<say1: "+say1+" <say3: "+say3);
            }
        }
         //say3'ün en küçük olma durumu
        if(say3<say2 && say3<say1){
            if(say2<say1){
                System.out.println("say3: "+say3+"<say2: "+say2+" <say1: "+say1);
            }else{
                System.out.println("say3: "+say3+"<say1: "+say1+" <say2: "+say2);
            }
        }
    }
}
