class Solution {
    public int[] sortArray(int[] nums) {
        //implement quick sorthi
        if(nums==null || nums.length==0) return nums;
        quickSort(nums,0,nums.length-1); 
        return nums;
    }

    private void quickSort(int[] nums, int l, int r){
        if(l < r){
            int pivotIndex = partition(nums,l,r);
            quickSort(nums,l,pivotIndex-1);
            quickSort(nums,pivotIndex+1,r);
        }
    }

    private int partition(int[] nums, int l, int r){
        int pivot = nums[r];
        int j = l;
        for(int k = l; k < r; k++){
            if(nums[k] < pivot) {
                swap(nums, j, k);
                j++;
            }
        }
        swap(nums,j,r);
        return j;
    }

    void swap(int[] nums, int l, int r){
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }
}