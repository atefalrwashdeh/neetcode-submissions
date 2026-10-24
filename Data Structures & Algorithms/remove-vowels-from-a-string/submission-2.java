class Solution {
    public String removeVowels(String s) {
        StringBuilder result = new StringBuilder(s.length());
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            switch(ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    break;
                default:
                    result.append(ch);
            }
        }
        return result.toString();
        //return s.replaceAll("[aeiouAEIOU]", "");
    }
}
