class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int goodPairs = 0;
        
        for (int num : nums) {
            // Every time we see a number, it can form a pair with all previous occurrences of itself
            goodPairs += count[num];
            // Increment the count for this number
            count[num]++;
        }
        
        return goodPairs;
    }
}
