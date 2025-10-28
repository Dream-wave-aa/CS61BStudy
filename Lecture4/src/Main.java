public class Main {
    static void main(String[] args){
        SLList L = new SLList(1);
        L.addFirst(2);
        L.addLast(3);
        System.out.println(L.getFirst());

    }
}



class SLList{

    private class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int f, IntNode r){
            item = f;
            next = r;
        }
    }
    /* The first item , if it exists, is at sentinel.next. */
    private final IntNode sentinel;
    private int size;

    /* Create a new SLList with one item , namely x. */
    public SLList(int x){
        sentinel = new IntNode(0,null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /* Adds item x to the front of the list. */
    public void addFirst(int x){
        sentinel.next = new IntNode(x, sentinel.next);
        size += 1;
    }

    /* Gets the first item in the list. */
    public int getFirst(){
        return sentinel.next.item;
    }

    /* Adds x to the end of the list. */
    public void addLast(int x){
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


// Your computer stores information in "memory"
// Information is stored in memory as a sequence of ones and zero.
// True stored as 00000001
// 8 primitive types in Java : byte , ...
// -----> CS61C
// JAVA creates an internal table that maps each variable name to a location.
// JAVA does NOT write anything into the reserved boxes.
// For safety , JAVA will not let you access a variable that is uninitialized

//
//
// Users of our class might be tempted to try to
// manipulate our secret intNode directly in uncouth ways!


// Hide implementation details from users of your class
// Less for user of class to understand.
// Safe for you to change private methods
//
// Car analogy:
// Public: Pedals , Steering Wheel
// Private: Fuel line , Rotary valve
//