class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] arr = new int[2*length];
        for(int i = 0; i<length;i++){
            arr[i] = nums[i];
            arr[i+length] = nums[i];
        }
        return arr;
    }
}