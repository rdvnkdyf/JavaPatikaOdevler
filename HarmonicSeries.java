class HarmonicSeries{
public static void main(String[] args){
 float array[]={1.0f,2.0f,3.0f,4.0f,5.0f};
 float result=TheHarmonicSeries(array, array.length);
 System.out.println(result);
}
public static float TheHarmonicSeries(float array[],int n){
    float sum=0;
    for(float i:array){
        sum+=1/i;
    }
    return n/sum;
}
}