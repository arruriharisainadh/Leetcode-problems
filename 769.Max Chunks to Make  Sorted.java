class Solution {
    public int maxChunksToSorted(int[] arr) {
        int maxSoFar = 0;
        int chunks = 0;

        for (int i = 0; i < arr.length; i++) {
            maxSoFar = Math.max(maxSoFar, arr[i]);
            
            // If the maximum value seen so far equals the current index,
            // all elements up to index i can form a valid sorted chunk.
            if (maxSoFar == i) {
                chunks++;
            }
        }

        return chunks;
    }
}
