public class Heap {
    public int es=0;
    public int[] dizi;
    public Heap(int boyut){
        dizi=new int[boyut];
    }
    public void heapify(){
        int i=es-1;
        int parent=(i-1)/2;

        while (i>0&&parent>=0){
            if(dizi[parent]>dizi[i]) {
                int tmp = dizi[i];
                dizi[i] = dizi[parent];
                dizi[parent] = tmp;

            }
            i = parent;
            parent = (i - 1) / 2;
        }
    }
    public void reverseHeapify(){
        int i=0;
        int lc=2*i+1;
        int rc=2*i+2;
        while (i<es&&rc<es) {
            if (dizi[i] < dizi[rc] || dizi[i] < dizi[rc]) break;
            else {
                if (dizi[rc] < dizi[lc]) {
                    if (dizi[rc] < dizi[i]) {
                        int tmp = dizi[i];
                        dizi[i] = dizi[rc];
                        dizi[rc] = tmp;
                        i = rc;
                        lc = i * 2 + 1;
                        rc = i * 2 + 2;
                    }
                } else if (dizi[lc] < dizi[rc]) {
                    if (dizi[lc] < dizi[i]) {
                        int tmp = dizi[i];
                        dizi[i] = dizi[lc];
                        dizi[lc] = tmp;
                        i = lc;
                        lc = i * 2 + 1;
                        rc = i * 2 + 2;
                    }
                }
            }
        }
    }
    public void ekle(int data){
        dizi[es]=data;
        es++;
        heapify();
    }
    public int pop(){
        int don=dizi[0];
        dizi[0]=dizi[es-1];
        es--;
        reverseHeapify();
        return don;

    }

}
