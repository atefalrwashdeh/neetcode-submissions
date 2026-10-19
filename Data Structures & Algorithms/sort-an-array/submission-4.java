class Solution {
    public int[] sortArray(int[] nums) {
        //implement merge sort
        if(nums == null || nums.length <= 1) return nums;

        int l = 0;
        int r = nums.length-1;
        mergeSort(nums,l,r);
        return nums;
    }

    private void mergeSort(int[] nums, int l, int r){
        if(l<r){
            int mid = l +(r-l)/2;
            mergeSort(nums,l,mid);
            mergeSort(nums, mid+1, r);
            merge(nums,l, mid, r);
        } 
    }
    private void merge(int[]nums, int l, int mid, int r){
        int[] left = new int[mid-l+1];
        int[] right =new int[r-mid];
        //create left array

        for(int i=0; i<left.length;i++){
            left[i] = nums[i+l];
        }

        //create right array
        for(int j = 0; j < right.length;j++){
            right[j] = nums[mid+1+j];
        }

        int i=0, j=0,k = l;
        while(i<left.length && j<right.length){
            if(left[i]<=right[j]){
                nums[k++] = left[i++];
            }
            else{
                nums[k++] = right[j++];
            }

        }

        while(i<left.length){
             nums[k++] = left[i++];
        }

        while(j<right.length){
            nums[k++] = right[j++];
        }


    }
}