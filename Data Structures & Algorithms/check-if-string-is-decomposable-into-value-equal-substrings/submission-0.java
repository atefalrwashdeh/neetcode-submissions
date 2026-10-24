class Solution {
    public boolean isDecomposable(String s) {
        if(s == null || s.isEmpty()) return false;
        boolean result = false;
        int i = 0;

        while(i<s.length()){
            int end = i+1;
            while(end < s.length() && s.charAt(end) == s.charAt(i)){
                end++;
            }
            int rem = (end-i) % 3;
            if(rem == 1 || (rem==2 && result)){
                return false;
            }
            if(rem ==2) result = true;
            i = end;
        }
        return result;

    }
}
