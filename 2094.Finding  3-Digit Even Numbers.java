import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> resultSet = new TreeSet<>();
        
        int n = digits.length;
        // Try all combinations of 3 digits
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == j || j == k || i == k) continue; // distinct indices
                    
                    int d1 = digits[i], d2 = digits[j], d3 = digits[k];
                    
                    // First digit cannot be zero, last digit must be even
                    if (d1 != 0 && d3 % 2 == 0) {
                        int num = d1 * 100 + d2 * 10 + d3;
                        resultSet.add(num);
                    }
                }
            }
        }
        
        // Convert to array
        int[] result = new int[resultSet.size()];
        int idx = 0;
        for (int num : resultSet) {
            result[idx++] = num;
        }
        return result;
    }
}
