class Solution {
    public void func(char[][] grid,int row,int col,boolean[][] visited){
        if(row<0 || col<0 || row>=grid.length || col>=grid[0].length || visited[row][col] || grid[row][col]=='0'){
            return;
        }
        visited[row][col] = true;
        int dir[][] = {{1,0},{-1,0},{0,1},{0,-1}};
        for(int[] d : dir){
            func(grid,row+d[0],col+d[1],visited);
        }
        return;
    }
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    func(grid,i,j,visited);
                    count++;
                }
            }
        } 
    return count;
    }
}
