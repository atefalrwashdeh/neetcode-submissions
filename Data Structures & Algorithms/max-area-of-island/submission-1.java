class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int maxArea = 0;
        boolean[][] visited = new boolean[row][col];
        for(int r = 0; r < row ; r++){
            for(int c = 0; c<col;c++){
                if(grid[r][c]==1 && !visited[r][c]){
                    int area = dfs(grid,r,c,visited);
                    maxArea = Math.max(area,maxArea);
                }
            }
        }
        return maxArea;
        
    }
    int dfs(int[][] grid, int r, int c, boolean[][] visited){
        int row = grid.length;
        int col = grid[0].length;
        if(r<0 || c < 0|| r >=row||c >=col || grid[r][c]==0||visited[r][c]){
            return 0;
        }
        visited[r][c] = true;
        int area = 1;
        area += dfs(grid, r - 1, c, visited); // up
        area += dfs(grid, r + 1, c, visited); // down
        area += dfs(grid, r, c - 1, visited); // left
        area += dfs(grid, r, c + 1, visited); // right

        return area;

    }
}
