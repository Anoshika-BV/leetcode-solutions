class Solution {
    public int arrangeCoins(int n) {
        //test
        int ans=0,index=1;
        while(n>=index){
            ans++;
            n-=index;
            index++;
        }
        return ans;
    }
}