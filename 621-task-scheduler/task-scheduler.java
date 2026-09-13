class Solution {
    public int leastInterval(char[] tasks, int n) {
        //test
        int[] count = new int[26];

        for (char c : tasks)
            count[c - 'A']++;

        Arrays.sort(count);

        int max = count[25];
        int ans = (max - 1) * (n + 1);

        for (int i = 25; i >= 0 && count[i] == max; i--)
            ans++;

        return Math.max(ans, tasks.length);
    }
}