class Solution {
    public String longestPalindrome(String s) {
        //test
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            ans = check(s, i, i, ans);
            ans = check(s, i, i + 1, ans);
        }

        return ans;
    }

    public String check(String s, int l, int r, String ans) {
        while (l >= 0 && r < s.length() &&
               s.charAt(l) == s.charAt(r)) {

            if (r - l + 1 > ans.length())
                ans = s.substring(l, r + 1);

            l--;
            r++;
        }
        return ans;
    }
}