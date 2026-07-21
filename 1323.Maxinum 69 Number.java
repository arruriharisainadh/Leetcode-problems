class Solution {
    public int maximum69Number (int num) {
        // Convert number to string
        String s = String.valueOf(num);
        
        // Replace the first '6' with '9'
        s = s.replaceFirst("6", "9");
        
        // Convert back to integer
        return Integer.parseInt(s);
    }
}
