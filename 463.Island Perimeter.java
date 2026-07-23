class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    perimeter += 4; // each land cell contributes 4 sides

                    // subtract shared sides with neighbors
                    if (r > 0 && grid[r - 1][c] == 1) perimeter -= 2; // top neighbor
                    if (c > 0 && grid[r][c - 1] == 1) perimeter -= 2; // left neighbor
                }
            }
        }
        return perimeter;
    }
}
