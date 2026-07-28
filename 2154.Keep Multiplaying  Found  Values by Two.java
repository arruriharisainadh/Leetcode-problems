import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        
        // Store all elements in a HashSet for O(1) lookup
        for (int num : nums) {
            set.add(num);
        }
        
        // Repeatedly double original as long as it exists in the set
        while (set.contains(original)) {
            original *= 2;
        }
        
        return original;
    }
}
