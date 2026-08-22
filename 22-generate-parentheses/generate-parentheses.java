public class Solution {
    public List<String> generateParenthesis(int n) {
        //test
        List<String> res = new ArrayList<>();
        String s="";
        backtrack(0, 0, n, res, s);
        return res;
    }

    private void backtrack(int open, int close, int n, List<String> res, String str) {
        if (open == close && open == n) {
            res.add(str);
            return;
        }

        if (open < n) {
            str+="(";
            backtrack(open + 1, close, n, res, str);
            str=str.substring(0,str.length()-1);
        }
        if (close < open) {
            str+=")";
            backtrack(open, close + 1, n, res, str);
            str=str.substring(0,str.length()-1);
        }
    }
}