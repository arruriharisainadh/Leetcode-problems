class Solution {
    public String largestOddNumber(String num) {
        // Iterate backwards from the end of the string
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            
            // The first odd digit found from the right forms the boundary for the largest odd substring
            if (digit % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        
        // If no odd digit exists in the string
        return "";
    }
}
