class Solution {
    public int countBinarySubstrings(String s) {
        //test
        int n    = s.length();
        int curr = 1;
        int prev = 0;
        int res  = 0;


        for( int i = 1; i < n; i++ ) {

            if( s.charAt(i - 1) == s.charAt(i) ) {
                curr += 1;
            }
            else{
                
                res += Math.min( prev, curr );
                prev = curr;
                curr = 1;
            }
        }
        res += Math.min( prev, curr );

        return res;
    }
}