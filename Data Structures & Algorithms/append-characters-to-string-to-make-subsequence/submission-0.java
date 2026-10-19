class Solution {
    public int appendCharacters(String s, String t) {
        if(s.contains(t)) return 0;
        else {
            int sLen = s.length();
            int tLength = t.length();
            int i = 0, j = 0;
            while (i < sLen && j < tLength) {
                if (s.charAt(i) == t.charAt(j)) {
                    j++;
                }
                i++;
            }
            return tLength - j;
        }
    

        
    }
}