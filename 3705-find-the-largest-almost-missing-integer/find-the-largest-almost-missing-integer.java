class Solution {
    public int largestInteger(int[] nums, int k) {
        //test
        int n = nums.length;
        final int MAX = 50;
        int freq[] = new int[MAX + 1];
        int max = Integer.MIN_VALUE;
        for(int x: nums) {
            freq[x]++;
            max = Math.max(max, x);
        }
        if(k == n) {
            return max;
        }else if(k == 1) {
            for(int i = MAX; i >= 0; i--) {
                if(freq[i] == 0) continue;
                if(freq[i] == 1) return i;
            }
            return -1;
        }else {
            max = -1;
            if(freq[nums[0]] == 1) max = Math.max(max, nums[0]);
            if(freq[nums[n - 1]] == 1) max = Math.max(max, nums[n - 1]);
            return max;
        }
    }
}