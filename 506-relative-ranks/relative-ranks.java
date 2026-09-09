class Solution {
    public String[] findRelativeRanks(int[] score) {
        //test
        int[] a = score.clone();
        Arrays.sort(a);

        String[] ans = new String[score.length];

        for (int i = 0; i < score.length; i++) {
            int rank = 1;

            for (int j = a.length - 1; j >= 0; j--, rank++) {
                if (score[i] == a[j]) {
                    if (rank == 1) ans[i] = "Gold Medal";
                    else if (rank == 2) ans[i] = "Silver Medal";
                    else if (rank == 3) ans[i] = "Bronze Medal";
                    else ans[i] = "" + rank;
                    break;
                }
            }
        }
        return ans;
    }
}