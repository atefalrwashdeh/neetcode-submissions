class Solution {
    public boolean confusingNumber(int n) {
        String numStr = String.valueOf(n);
        StringBuilder confusingStr = new StringBuilder();
        for (int i = numStr.length() - 1; i >= 0; i--) {
            char c = numStr.charAt(i);
            switch (c) {
                case '0':
                case '1':
                case '8':
                    confusingStr.append(c);
                    break;
                case '6':
                    confusingStr.append('9');
                    break;
                case '9':
                    confusingStr.append('6');
                    break;
                default:
                    return false;
            }
        }
        return !confusingStr.toString().equals(String.valueOf(n));

        
    }
}
