import org.w3c.dom.Node;

public class gfg2{
    public static void main(String[] args) {
        class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        Node current = head;
        // current = head;
        int count =0;
        while(current!=null){
            current=current.next;
            count ++;
        }
        return count;
    }
}

    }
}