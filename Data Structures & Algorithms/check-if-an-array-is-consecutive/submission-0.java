class Solution {
    public boolean isConsecutive(int[] nums) {
        if(nums.length==1)
            return true;
        else{
            Arrays.sort(nums);
            for(int i = 0; i< nums.length - 1; i++){
                if(nums[i]==nums[i+1]) return false;
                if(nums[i] + 1 != nums[i+1]) return false;
            }
        }
        return true;

    }
}
