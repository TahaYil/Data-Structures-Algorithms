import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi={2,5,23,4,1,12,5};
        System.out.println(Arrays.toString(dizi));
        for (int gap= dizi.length/2;gap>0;gap/=2) {
            for (int i = gap; i < dizi.length; i+=gap) {
                int tmp = dizi[i];
                int j;
                for (j = i; j > 0 && dizi[j - gap] > tmp; j-=gap) {
                    dizi[j] = dizi[j - gap];
                }
                dizi[j] = tmp;

            }
        }

        System.out.println(Arrays.toString(dizi));
    }
}