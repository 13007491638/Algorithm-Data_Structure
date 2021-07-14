import java.util.ArrayList;
import java.util.HashMap;

public class Offer_35 {
}

/*
// Definition for a Node.

*/
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution35 {
    public Node copyRandomList(Node head) {
        HashMap<Integer,Node> hashMap = new HashMap();
        Node n = null;
        while (head != null) {
            hashMap.put(head.val,head.random);
            head = head.next;
        }
        while (head != null) {
            n.next = head.next;
            n.val = head.val;
            n = n.next;
            head = head.next;
        }
        while(n != null){
            n.random = hashMap.get(n.val);
        }
        return n;
    }
}