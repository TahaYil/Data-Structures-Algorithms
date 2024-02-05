
public class Main {

    public static void mergeSort(int[] dizi) {
        int l=0;
        int r= dizi.length-1;
        reculsiveMerge(dizi,l,r);

    }

    private static void reculsiveMerge(int[] dizi, int l, int r) {
        if(l>=r)return;

        int middle=(r+l)/2;

        reculsiveMerge(dizi,l,middle);
        reculsiveMerge(dizi,middle+1,r);
        merge(dizi,l,middle,r);



    }

    private static void merge(int[] dizi, int l, int middle, int r) {
        int i=l;
        int j=middle+1;
        int[] temp=new int[(r-l+1)];
        int es=0;
        while (i<=middle  && j<=r){
            if(dizi[i]>dizi[j]){
                temp[es]=dizi[j];
                j++;es++;
            }
            else {
                temp[es]=dizi[i];
                i++;es++;
            }

        }
        while(i<=middle && es< temp.length){
            temp[es]=dizi[i];
            i++;es++;
        }
        while(j<=r&&es< temp.length){
            temp[es]=dizi[j];
            j++;es++;
        }
        int es0=0;
        for(int k=l;k<=r&&es0< temp.length;k++){
            dizi[k]=temp[es0];
            es0++;
        }


    }


    public static void main(String[] args) {
        int[] dizi={7,2,7,3,6,9,32,1};
        for (Integer d:dizi) System.out.print(d+" ");
        mergeSort(dizi);
        System.out.println("");
        for (Integer d:dizi) System.out.print(d+" ");
    }

}
