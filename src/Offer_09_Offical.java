import java.util.LinkedList;
import java.util.Stack;

public class Offer_09_Offical {
}

class CQueue1 {
    LinkedList<Integer> A,B;

    public CQueue1() {
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        A.addLast(value);
    }

    public int deleteHead() {
        if(!B.isEmpty()){
            return B.removeFirst();
        }
        if (A.isEmpty()){
            return -1;
        }
        while(!A.isEmpty())
            B.addLast(A.removeFirst());
        return B.removeFirst();
    }
}