import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Offer_30 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.min());
    }
}

class MinStack {
    LinkedList<Integer> rank,stack;

    /** initialize your data structure here. */
    public MinStack() {
        rank = new LinkedList<Integer>();
        stack = new LinkedList<Integer>();
    }

    public void push(int x) {
        stack.push(x);
        if (rank.isEmpty() || rank.peek()>=x) {
            rank.push(x);
        }
    }

    public void pop() {
        if(stack.pop().equals(rank.peek())){
            rank.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return rank.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */