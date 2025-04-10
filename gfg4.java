public class gfg4 {
    class Solution {
        static boolean searchKey(int n, Node head, int key) {
            // Code here
            Node current = head;
            while (current != null){
                if(current.data==key){
                    return true;
                }
                current=current.next;
            }
            return false;
        }
    }
    
}
