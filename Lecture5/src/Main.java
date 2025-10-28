public class Main {
    static void main(String[] args){
        SLList<Integer> L = new SLList<Integer>(1);
        L.addFirst(2);
        L.addLast(3);
        System.out.println(L.getFirst());

    }
}



class SLList <T>{

    private class IntNode {
        public T item;
        public IntNode next;
        public IntNode before;

        public IntNode(T f, IntNode r){
            item = f;
            next = r;
        }
    }
    /* The first item , if it exists, is at sentinel.next. */
    private final IntNode sentinel;
    private IntNode last;
    private int size;

    /* Create a new SLList with one item , namely x. */
    public SLList(T x){
        sentinel = new IntNode(null ,null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /* Adds item x to the front of the list. */
    public void addFirst(T x){
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    /* Gets the first item in the list. */
    public T getFirst(){
        return sentinel.next.item;
    }

    /* Adds x to the end of the list. */
    public void addLast(T x){
        size += 1;
        IntNode p = sentinel;

//        if(first == null){
//            first = new IntNode(x,null);
//            return;
//        }

        /* Scans p until it reaches the end of the list. */
        while(p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x,null);

    }
    //    /* Returns the size of the list. */
//    public int size(){
//        return size(first);
//    }
//    /* Returns the size of the list , starting at IntNode p*/
//    private int size(IntNode p){
//        if(p.next == null){
//            return 1;
//        }
//        return 1 + size(p.next);
//    }
    /**/
    public int size(){
        return size;
    }
    // There ain't no such thing as a free lunch
    //
}

// DLList
// circular sentinel or double sentinel in double Linked list
//

// Arrays
//
// The AList we can harness arrays to build such a list

// Unlike class instances which have named memory boxes.
// Arrays consist of A fixed integer length(canNOT change!)
// arrays do NOT have methods
// 