class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int numIslands = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1' && !visited[r][c]) {
                    dfs(grid, r, c, visited);
                    numIslands++;
                }
            }
        }
        return numIslands;
    }
    private void dfs(char[][] grid, int r, int c, boolean[][] visited){
        int rows = grid.length;
        int cols = grid[0].length;
        if(r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c]=='0'||visited[r][c]){
            return;
        }
        visited[r][c] = true;
        dfs(grid, r - 1, c, visited); // up
        dfs(grid, r + 1, c, visited); // down
        dfs(grid, r, c - 1, visited); // left
        dfs(grid, r, c + 1, visited); // right

    }
}
