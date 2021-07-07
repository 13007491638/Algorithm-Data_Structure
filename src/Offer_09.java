import java.util.Stack;

public class Offer_09 {
}

class CQueue {
    Stack<Integer> A,B ;

    public CQueue() {
        A = new Stack();
        B = new Stack();
    }

    public void appendTail(int value) {
        A.push(value);
    }

    public int deleteHead() {
        if(!B.isEmpty()){
            return B.pop();
        }
        if (A.isEmpty()){
            return -1;
        }
        while(!A.isEmpty())
            B.push(A.pop());
        return B.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */