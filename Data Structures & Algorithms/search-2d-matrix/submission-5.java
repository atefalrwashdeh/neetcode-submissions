class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        // int rows = matrix.length;
        // int cols = matrix[0].length;
        // int mid;
        // int left = 0;
        // int right = (rows * cols)-1;
        // while(left <= right){
        //     mid = left + (right -left)/2;
        //     int midValue = matrix[mid/cols][mid%cols];
        //     if(midValue == target) return true;
        //     if(midValue < target) left = mid+1; 
        //     else right = mid -1;
        // }
        // return false;
        int rows = matrix.length;
        int col = matrix[0].length;
        int top = 0;
        int bottom = rows - 1;
        while (top <= bottom) {
            int midRow = top + (bottom - top) / 2;
            if (matrix[midRow][0] == target) return true;
            if (matrix[midRow][0] < target) {
                top = midRow + 1;
            } else {
                bottom = midRow - 1;
            }
        }
        int targetRow = bottom;
        if (targetRow < 0) return false;
        int left = 0;
        int right = col - 1;
        while (left <= right) {
            int midCol = left + (right - left) / 2;
            if (matrix[targetRow][midCol] == target) return true;
            if (matrix[targetRow][midCol] < target) {
                left = midCol + 1;
            } else {
                right = midCol - 1;
            }
        }
        return false;
        
    }
}