import java.util.Arrays;

public class Radix {
    public static void sirala(int[] dizi){
        int eb=-9999;
        for(int i=0;i< dizi.length;i++){
            if(dizi[i]>eb)eb=dizi[i];
        }
        int basamak=1;
        int[] count=new int[10];
        int[] temp=new int[dizi.length];

        while (eb/basamak>0){
            Arrays.fill(count,0);

            for(int i=0;i< dizi.length;i++)count[(dizi[i]/basamak)%10]++;
            for(int i= 1;i<10;i++)count[i]+=count[i-1];


            for(int i= dizi.length-1;i>=0;i--)temp[--count[(dizi[i]/basamak)%10]]=dizi[i];




            for (int i=0;i< dizi.length;i++)dizi[i]=temp[i];

            basamak*=10;
        }






    }

    public static void main(String[] args) {
        int[] dizi={9,12,421,124,5,1};
        for (int d:dizi) System.out.print(d+" ");
        sirala(dizi);
        System.out.println();
        for (int d:dizi) System.out.print(d+" ");
    }



}
