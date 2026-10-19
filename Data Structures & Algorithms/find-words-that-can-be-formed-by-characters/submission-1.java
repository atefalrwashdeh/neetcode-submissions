class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        int[] charCount = new int[26];
       // List<String> success = new ArrayList<>();
        int countOfLetters=0;
        for (char c : chars.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (String word : words) {
            count = new int[26];
            for (char c : word.toCharArray()) {
                count[c - 'a']++;
            }
            boolean ok = true;
            for(int i=0; i< 26;i++){
                if(charCount[i] < count[i]) {
                    ok = false;
                    break;
                }
            }
            if (ok) countOfLetters += word.length();
        }
        // for(String ele : success){
        //     countOfLetters += ele.length();
        // }
        return countOfLetters;
    }
}