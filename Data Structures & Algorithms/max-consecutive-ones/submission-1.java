class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int macCount = 0;
        int count = 0;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 1){
                count++;
            }else{
                macCount = Math.max(macCount, count);
                count = 0;
            }
        }
        return Math.max(macCount, count);
        
    }
}