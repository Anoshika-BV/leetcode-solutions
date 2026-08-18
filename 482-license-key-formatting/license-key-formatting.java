class Solution {
    public String licenseKeyFormatting(String s, int k) {
        //test
        s = s.replace("-", "").toUpperCase();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && (s.length() - i) % k == 0)
                ans.append("-");

            ans.append(s.charAt(i));
        }

        return ans.toString();
    }
}