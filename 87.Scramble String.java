import java.util.HashMap;
import java.util.Map;

class Solution {
    // Memoization table to store intermediate results: "s1,s2" -> boolean
    private Map<String, Boolean> memo = new HashMap<>();

    public boolean isScramble(String s1, String s2) {
        // Base Cases
        if (s1.equals(s2)) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }

        // Quick check: if character frequencies don't match, s2 can't be a scramble of s1
        if (!hasSameLetters(s1, s2)) {
            return false;
        }

        // Check memoized result
        String key = s1 + "," + s2;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        int n = s1.length();

        // Try splitting the string at every possible pivot point
        for (int i = 1; i < n; i++) {
            // Case 1: Without swapping the two halves
            // s1[0..i] matches s2[0..i] AND s1[i..n] matches s2[i..n]
            boolean noSwap = isScramble(s1.substring(0, i), s2.substring(0, i)) &&
                             isScramble(s1.substring(i), s2.substring(i));

            if (noSwap) {
                memo.put(key, true);
                return true;
            }

            // Case 2: With swapping the two halves
            // s1[0..i] matches s2[n-i..n] AND s1[i..n] matches s2[0..n-i]
            boolean swap = isScramble(s1.substring(0, i), s2.substring(n - i)) &&
                           isScramble(s1.substring(i), s2.substring(0, n - i));

            if (swap) {
                memo.put(key, true);
                return true;
            }
        }

        memo.put(key, false);
        return false;
    }

    // Helper method to prune branches where character counts differ
    private boolean hasSameLetters(String s1, String s2) {
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }
}
