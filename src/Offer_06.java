import java.util.ArrayList;

public class Offer_06 {
    public static void main(String[] args) {
        Offer_06 o = new Offer_06();
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode last = new ListNode(2);
        head.next = second;
        second.next = last;
        System.out.println(o.reversePrint(head));
    }

    public int[] reversePrint(ListNode head) {
        int[]an = {};
        if (head == null) {
            return an;
        }
        else {
            ArrayList a = new ArrayList();
            for (int i = 0; head.next!=null ; head = head.next) {
                a.add(head.val);
            }
            a.add(head.val);
            int[] result = new int[a.size()];
            for(int i = 0 ; i<a.size(); i++){
                result[i] = (int) a.get(a.size()-i-1);
            }
            return result;
        }
    }
}

class ListNode {
   int val;
   ListNode next;
   ListNode(int x) { val = x; }
}