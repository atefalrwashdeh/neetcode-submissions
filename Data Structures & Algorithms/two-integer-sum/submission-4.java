class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int length = nums.length;
        // for (int i = 0; i < length; i++) {
        //     for (int j = i + 1; j < length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[]{i, j};
        //         }
        //     }
        // }
        // return new int[]{-1, -1}; 
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int diff = target- nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
