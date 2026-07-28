class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        // If the total number of elements doesn't match m * n, it's impossible
        if (original.length != m * n) {
            return new int[0][0];
        }
        
        int[][] result = new int[m][n];
        
        // Fill the 2D array row by row
        for (int i = 0; i < original.length; i++) {
            result[i / n][i % n] = original[i];
        }
        
        return result;
    }
}
