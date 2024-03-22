public class BSTree {
    public Node root;
    //public int[][] matrix=new int[6][6];

    public BSTree() {
        root = null;
    }

    public void ekle(int data) {
        root=REkle(root, data);

    }

    public Node REkle(Node current, int data) {
        if (current == null) {
            current = new Node(data);
            return current;
        } else if (current.data > data) current.lchild = REkle(current.lchild, data);
        else current.rchild = REkle(current.rchild, data);

        return current;
    }





    public void ara(int data){
        RAra(root,data);
    }
    public Node RAra(Node current,int data){
        if(current==null)return null;


        if(current.data>data)RAra(current.lchild,data);
        else if (current.data<data) RAra(current.rchild,data);
        else if(current.data==data)return current;
        //else return null;
        return current;
    }
    public void sil(int data){
        RSil(root,data);
    }
    public Node RSil(Node current,int data){
        if(current==null)return null;

        if(data<current.data)current.lchild=RSil(current.lchild,data);
        else if(data>current.data)current.rchild=RSil(current.rchild,data);
        else{
            if(current.lchild==null)return current.rchild;
            else if(current.rchild==null)return current.lchild;
            else{
                int maxS=max(current.lchild);
                current.data=maxS;
                current.lchild= RSil(current.lchild,maxS);

            }
        }



        return current;
    }
    public int max(Node current){
        int max=current.data;
        while (current.rchild!=null){

            current=current.rchild;
            max=current.rchild.data;
        }
        return max;
    }
    public void yaz(){
        yazdir(root);
    }
    public void yazdir(Node current){
        if(current==null)return;
        else{
        System.out.print(current.data+"  ");
        yazdir((current.lchild));
        yazdir(current.rchild);}

    }

}
