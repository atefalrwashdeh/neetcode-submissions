class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {

        int rows=grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        if(grid[0][0]==1 || grid[rows-1][cols-1]==1) return -1;
        Deque<int[]> qu = new ArrayDeque<>();
        qu.add(new int[]{0,0}); 
        visited[0][0] = true;
        int length = 1;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0},
                {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
        while(!qu.isEmpty()){
            int quSize = qu.size();
            for(int i = 0; i<quSize;i++){
                int[] cell = qu.poll();
                int row = cell[0];
                int col = cell[1];
                if(row == rows-1 && col == cols-1){
                    return length;
                }
                for(int[] dir : directions){
                    int newRow = row+dir[0];
                    int newCol = col + dir[1];
                    if(newRow>=0 && newRow<rows && newCol >=0 &&
                    newCol <cols && !visited[newRow][newCol] 
                    && grid[newRow][newCol] == 0){
                        qu.add(new int[]{newRow,newCol});
                        visited[newRow][newCol]= true;
                    }
                }

            }
            length++;
        }
        return -1;
        
    }
}