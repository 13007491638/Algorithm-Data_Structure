import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Offer_59_Ⅱ_Offical {
}

class MaxQueueO {
    Queue<Integer> queue;
    Deque<Integer> deque;
    public MaxQueueO() {
        queue = new LinkedList<>();
        deque = new LinkedList<>();
    }
    public int max_value() {
        return deque.isEmpty() ? -1 : deque.peekFirst();
    }
    public void push_back(int value) {
        queue.offer(value);
        while(!deque.isEmpty() && deque.peekLast() < value)
            deque.pollLast();
        deque.offerLast(value);
    }
    public int pop_front() {
        if(queue.isEmpty()) return -1;
        if(queue.peek().equals(deque.peekFirst()))
            deque.pollFirst();
        return queue.poll();
    }

}