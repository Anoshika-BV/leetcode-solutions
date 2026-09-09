class Solution {
    public int numDistinct(String s, String t) {
        //test
        long[] dp = new long[t.length() + 1];
        dp[0] = 1;

        for (char a : s.toCharArray())
            for (int j = t.length() - 1; j >= 0; j--)
                if (a == t.charAt(j))
                    dp[j + 1] += dp[j];

        return (int) dp[t.length()];
    }
}