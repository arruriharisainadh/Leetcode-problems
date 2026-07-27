import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // If the element already exists within the last k elements
            if (window.contains(nums[i])) {
                return true;
            }

            window.add(nums[i]);

            // Maintain the window size to at most k
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;
    }
}
