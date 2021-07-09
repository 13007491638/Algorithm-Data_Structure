import java.util.LinkedList;

public class Offer_24 {
    public static void main(String[] args) {
        Offer_24 o = new Offer_24();
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(3);
        ListNode last = new ListNode(2);
        head.next = second;
        second.next = last;
        Solution solution = new Solution();
        System.out.println(solution.reverseList(head));
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ListNode listNode = new ListNode(0);
        while (head != null) {
            linkedList.addLast(head.val);
            head = head.next;
        }
        while (linkedList.size() > 0){
            listNode.next = new ListNode(linkedList.remove());
        }
        return listNode;
    }
}