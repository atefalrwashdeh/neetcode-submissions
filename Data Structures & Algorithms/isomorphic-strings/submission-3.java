class Solution {
    public boolean isIsomorphic(String s, String t) {
        // int[] mapS = new int[256];
        // int[] mapT = new int[256];
        // for (int i = 0; i < s.length(); i++) {
        //     char c1 = s.charAt(i);
        //     char c2 = t.charAt(i);
        //     if (mapS[c1] == 0 && mapT[c2] == 0) {
        //         mapS[c1] = c2;
        //         mapT[c2] = c1;
        //     } else if (mapS[c1] != c2 || mapT[c2] != c1) {
        //         return false;
        //     }
        // }
        // return true;

        Map<Character, Character> mapS = new HashMap<Character, Character>();
        Map<Character, Character> mapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (!mapS.containsKey(c1) && !mapT.containsKey(c2)) {
                mapS.put(c1, c2);
                mapT.put(c2, c1);
            } else if (!mapS.containsKey(c1) || !mapT.containsKey(c2) || mapS.get(c1) != c2 || mapT.get(c2) != c1) {
                return false;
            }
        }
        return true;
    }
}