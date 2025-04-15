public class leetcode6 {
    public class Solution {
        public ListNode detectCycle(ListNode head) {
    
            if (head == null || head.next == null)
                return null;
    
            Map<ListNode, Integer> mp = new HashMap<>();
            int count = 0;
            ListNode temp = head;
            while (temp.next != null) {
                if (mp.containsKey(temp) && mp.get(temp) != count)
                    return temp;
                mp.put(temp, count);
                count++;
                temp = temp.next;
            }
            return null;
        }
    }
    
}
