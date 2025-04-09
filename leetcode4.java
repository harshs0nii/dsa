import java.util.*;
public class leetcode4 {
    public static int main(String[] args) {
        int[] nums = {3,5,5,6,8,8,9,};
        int n = nums.length;
        int count = 0;
        int i = 0;
        while (i < n) {
            Set<Integer> st = new HashSet<>();
            for (int j = i; j < n; j++) {
                st.add(nums[j]);
            }
            if ((n - i) == st.size())
                return count;
            count++;
            i += 3;
        }
        return count;
    }
    
}
