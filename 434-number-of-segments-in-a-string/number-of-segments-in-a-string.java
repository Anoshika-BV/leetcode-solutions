class Solution {
    public int countSegments(String s) {
        //test
        String[] arr = s.split(" ");
        int count = 0;
        for (String i : arr)
            if (i.length() != 0)
                count++;
        return count;
    }
}