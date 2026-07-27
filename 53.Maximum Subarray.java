class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend the previous subarray or start a new subarray from nums[i]
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            // Track the maximum sum encountered so far
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
}
