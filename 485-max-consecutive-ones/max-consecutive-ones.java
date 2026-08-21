class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        //test
        int count = 0, ans = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            ans = Math.max(count, ans);
        }

        return ans;
    }
}