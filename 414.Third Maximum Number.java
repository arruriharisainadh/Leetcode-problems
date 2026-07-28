class Solution {
    public int thirdMax(int[] nums) {
        // Use Long object pointers to cleanly handle Integer.MIN_VALUE cases
        Long max1 = null;
        Long max2 = null;
        Long max3 = null;

        for (int num : nums) {
            long n = num;

            // Skip duplicate values to ensure distinct maximums
            if ((max1 != null && n == max1) || 
                (max2 != null && n == max2) || 
                (max3 != null && n == max3)) {
                continue;
            }

            // Shift top values down when a new larger value is found
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }

        // If less than 3 distinct values exist, return the overall maximum (max1)
        return max3 == null ? max1.intValue() : max3.intValue();
    }
}
