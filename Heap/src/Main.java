public class Main {
    public static void main(String[] args) {
        Heap h=new Heap(10);
        h.ekle(22);
        h.ekle(2);
        h.ekle(11);
        h.ekle(4);
        h.ekle(32);
        h.ekle(1);

        //System.out.println(h.dizi[3]);
        int sayi= h.pop();
        System.out.println(sayi);
        sayi=h.pop();
        System.out.println(sayi);
        sayi=h.pop();
        System.out.println(sayi);
    }
}