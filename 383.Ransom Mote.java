class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Frequency array for 26 lowercase English letters
        int[] letterCounts = new int[26];

        // Count available characters in magazine
        for (char c : magazine.toCharArray()) {
            letterCounts[c - 'a']++;
        }

        // Deduct required characters for ransomNote
        for (char c : ransomNote.toCharArray()) {
            if (letterCounts[c - 'a'] == 0) {
                return false; // Not enough characters available
            }
            letterCounts[c - 'a']--;
        }

        return true;
    }
}
