class Solution {
    public boolean isPerfectSquare(long num) {
        //test
        long x = num;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }
        return x * x == num;
        
    }
}