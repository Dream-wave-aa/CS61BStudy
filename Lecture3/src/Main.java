public class Main {
    static void main(String[] args){

        // Array:
        // int[] x = new int[]{0,1,2,3,4};
        // System.out.println(x);  // [I@27716f4

        //

        //
        IntList L = new IntList(15,null);
        L = new IntList(10,L);
        L = new IntList(5,L);
        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.get(2));
    }
}

class IntList{
    public int first;
    public IntList rest;

    public IntList(int f, IntList r){
        first = f;
        rest = r;
    }
    /* Returns the size of the list using recursion */
    public int size(){
        if(rest == null){
            return 1;
        }
        return 1 + rest.size();
    }
    /* Return the size of the list using no recursion */
    public int iterativeSize(){
        IntList p = this;
        int totalSize =  0;
        while(p != null){
            totalSize += 1;
            p = p.rest;
        }

        return totalSize;
    }

    /* Return the ith item in the list */
    public int get(int i){
        if(i == 0){
            return first;
        }
        return rest.get(i-1);
    }

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
//