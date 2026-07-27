class Solution {
    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            // Check if character is an uppercase letter
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                // Convert uppercase to lowercase using ASCII difference ('a' - 'A' = 32)
                chars[i] = (char) (chars[i] + 32);
            }
        }
        
        return new String(chars);
    }
}
