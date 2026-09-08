class Solution {
    public int countCommas(int n) {
        //test
        int count = 0;

        for (int i = 1000; i <= n; i++) {
            if (i < 1000000)
                count++;
        }

        return count;
    }
}