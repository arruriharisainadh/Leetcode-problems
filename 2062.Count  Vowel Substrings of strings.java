class Solution {
    public int countVowelSubstrings(String word) {
        int n = word.length();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = word.substring(i, j);
                if (containsAllVowels(sub) && onlyVowels(sub)) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    private boolean containsAllVowels(String s) {
        return s.contains("a") && s.contains("e") && s.contains("i") 
               && s.contains("o") && s.contains("u");
    }
    
    private boolean onlyVowels(String s) {
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) == -1) return false;
        }
        return true;
    }
}
