class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                balance++;
            } else {
                balance--;
            }

            // Whenever balance hits 0, we found a balanced substring
            if (balance == 0) {
                count++;
            }
        }

        return count;
    }
}
