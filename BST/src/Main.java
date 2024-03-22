import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BSTree agac=new BSTree();
        agac.ekle(5);
        agac.ekle(7);
        agac.ekle(6);
        agac.ekle(8);
        agac.ekle(3);
        agac.ekle(4);
        agac.ekle(1);
        agac.ekle(2);
        agac.yaz();
        System.out.println();
        agac.sil(4);
        agac.yaz();


    }
}