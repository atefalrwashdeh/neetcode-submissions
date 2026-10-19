class Solution {
    public int orangesRotting(int[][] grid) {
       int row = grid.length;
        int col = grid[0].length;
        //return minutes
        Deque<int[]> queue = new java.util.ArrayDeque<>();
        int fresh = 0;
        int minutes = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        while (fresh > 0 && !queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] orange = queue.poll();
                for (int[] dir : directions) {
                    int newRow = orange[0] + dir[0];
                    int newCol = orange[1] + dir[1];
                    if (newRow >= 0 && newRow < row && newCol >= 0 && newCol < col && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        fresh--;
                        queue.offer(new int[]{newRow, newCol});
                    }
                }
            }
            minutes++;
        }
        return fresh==0 ? minutes : -1;

        
    }
}
