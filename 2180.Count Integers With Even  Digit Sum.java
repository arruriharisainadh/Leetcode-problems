class Solution {
    public int countEven(int num) {
        int temp = num;
        int digitSum = 0;
        
        // Compute digit sum of num
        while (temp > 0) {
            digitSum += temp % 10;
            temp /= 10;
        }
        
        // If the digit sum of num is even, exactly half are even
        // If odd, subtract 1 before dividing by 2
        return (digitSum % 2 == 0) ? num / 2 : (num - 1) / 2;
    }
}
