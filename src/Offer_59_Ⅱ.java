import java.util.LinkedList;

public class Offer_59_Ⅱ {
}

class MaxQueue {
    LinkedList<Integer> deque,rank;

    public MaxQueue() {
        deque = new LinkedList<Integer>();
        rank = new LinkedList<Integer>();
    }

    public int max_value() {
        return rank.pop();
    }

    public void push_back(int value) {
        deque.push(value);
        if (rank.isEmpty() || rank.peek()<=value){
            rank.pop();
            rank.push(value);
        }
    }

    public int pop_front() {
        if(deque.getFirst().equals(rank.peek())){
            rank.pop();
        }
        return rank.pop();
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */