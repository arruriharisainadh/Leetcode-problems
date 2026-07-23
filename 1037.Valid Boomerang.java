class Solution {
    public boolean isBoomerang(int[][] points) {
        // A boomerang is valid if the points are distinct and not collinear
        int x1 = points[0][0], y1 = points[0][1];
        int x2 = points[1][0], y2 = points[1][1];
        int x3 = points[2][0], y3 = points[2][1];

        // Check if any two points are the same
        if ((x1 == x2 && y1 == y2) || (x2 == x3 && y2 == y3) || (x1 == x3 && y1 == y3)) {
            return false;
        }

        // Check collinearity using area of triangle formula
        return (y2 - y1) * (x3 - x2) != (y3 - y2) * (x2 - x1);
    }
}
