class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // Since constraint states 0 <= nums[i] <= 100
        int[] count = new int[101];

        // Step 1: Count frequencies of each number
        for (int num : nums) {
            count[num]++;
        }

        // Step 2: Calculate running sum (prefix sum)
        // count[i] will now store the total numbers strictly smaller than i
        int runningSum = 0;
        int[] smallerCount = new int[101];
        
        for (int i = 0; i <= 100; i++) {
            smallerCount[i] = runningSum;
            runningSum += count[i];
        }

        // Step 3: Build the result array
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = smallerCount[nums[i]];
        }

        return result;
    }
}
