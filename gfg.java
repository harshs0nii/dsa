import org.w3c.dom.Node;

public class gfg {
    class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node newNode = new Node(x);
            if(head == null){
                head = newNode;
                return head;
            }
            Node currNode = head;
            while(currNode.next!=null){
                currNode = currNode.next;
            }
            currNode.next = newNode; 
            return head;
        }
        
    }
    
}
