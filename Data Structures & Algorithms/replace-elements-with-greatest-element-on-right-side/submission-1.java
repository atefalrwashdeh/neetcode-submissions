class Solution {
    public int[] replaceElements(int[] nums) {
                int start = 0;
        int end = nums.length - 1;
        // for (int num : nums) {
        //     System.out.print(num + " ");
        // }
        // System.out.println();
        for (int i = 0; i < nums.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] > max) {
                    max = nums[j];

                }

            }
            nums[i] = max;

        }
        nums[nums.length - 1] = -1;
        return nums;
        
    }
}