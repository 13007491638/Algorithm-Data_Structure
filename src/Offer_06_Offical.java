import java.util.ArrayList;
import java.util.Stack;

public class Offer_06_Offical {
    public static void main(String[] args) {
        Offer_06 o = new Offer_06();
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode last = new ListNode(2);
        head.next = second;
        second.next = last;
        System.out.print(o.reversePrint(head));
    }

    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack();
        while(head != null){
            stack.push(head.val);
            head = head.next;
        }
        int[]result = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            result[i] = stack.pop();
        }
        return result;
    }
}