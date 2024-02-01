public class Main {
    public static void QuickSort(int[] dizi){
        QS(dizi,0,(dizi.length-1));
    }
    public static void QS(int[] dizi,int l,int r){
        if(l>=r)return;
        int pivot=partition(dizi,l,r);
        QS(dizi,l,(pivot-1));
        QS(dizi,(pivot+1),r);
    }
    public static int partition(int[] dizi,int l,int r){
        int pivot=r;
        int i=l;
        int j=r-1;
        while (i<=j){

            while (i <= j && dizi[i] < dizi[pivot]) i++;
            while (i <= j && dizi[j] > dizi[pivot]) j--;

            if (j>i){
                swap(dizi,i,j);
                i++;
                j--;
            }

        }
        if(j<i)swap(dizi,i,pivot);

        return i;
    }
    public static void swap(int[] dizi,int i,int j){
        int temp=dizi[i];
        dizi[i]=dizi[j];
        dizi[j]=temp;
    }

    public static void main(String[] args) {
        int[] dizi={8,4,2,10,1,5,7,2};
        for (Integer d:dizi) System.out.print(d+" ");
        System.out.println(" ");
        QuickSort(dizi);
        for (Integer d:dizi) System.out.print(d+" ");

    }

}
