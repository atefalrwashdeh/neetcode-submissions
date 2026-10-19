class Solution {
    public int scoreOfString(String s) {
        //convert char to numbers
        int res = 0;
        for(int p= 0; p < s.length()-1; p++){
            res += Math.abs(s.charAt(p) - s.charAt(p+1));
        }
        return res;
    }
}