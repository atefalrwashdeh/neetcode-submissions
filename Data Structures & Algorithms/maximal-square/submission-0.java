class Solution {
    public int maximalSquare(char[][] matrix) {
        //bfs
        int maxSide = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (matrix[r][c] == '1') {
                    int side = 1;
                    boolean canExpand = true;
                    while (canExpand && r + side < rows && c + side < cols) {
                        for (int k = c; k <= c + side; k++) {
                            if (matrix[r + side][k] == '0') {
                                canExpand = false;
                                break;
                            }
                        }
                        for (int k = r; k <= r + side; k++) {
                            if (matrix[k][c + side] == '0') {
                                canExpand = false;
                                break;
                            }
                        }
                        if (canExpand) {
                            side++;
                        }
                    }
                    maxSide = Math.max(maxSide, side);
                }
            }
        }
        return maxSide * maxSide;
        
    }
}