class Solution {
    public void dfs(char[][] grid,int r, int c){
        if(r<0 || r>=grid.length|| c<0 || c>=grid[0].length || grid[r][c] == '0'){
            return;
        }
        grid[r][c] = '0';
        dfs(grid,r+1,c);
        dfs(grid,r,c+1);
        dfs(grid,r-1,c);
        dfs(grid,r,c-1);
    }
    public int numIslands(char[][] grid) {
        int result =0;
        if(grid == null || grid.length ==0) return 0;
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c] == '1'){
                    result++;
                    dfs(grid,r,c);
                }
            }
        }
        
        return result;
    }
}
