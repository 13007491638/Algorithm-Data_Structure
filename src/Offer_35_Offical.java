import java.util.HashMap;

public class Offer_35_Offical {
}

/*
// Definition for a Node.
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
*/
class Solution35O {
    public Node copyRandomList(Node head) {
        if(head == null) return  null;
        Node cur = head;
        HashMap<Node, Node> hashMap = new HashMap<Node, Node>();
        while (cur != null) {
            Node node = new Node(cur.val);
            hashMap.put(cur,node);
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            hashMap.get(cur).next = hashMap.get(cur.next);
            hashMap.get(cur).random = hashMap.get(cur.random);
            cur = cur.next;
        }
        return hashMap.get(head);
    }
}