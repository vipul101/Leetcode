class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = row;
        
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][col - j - 1];
                matrix[i][col - j - 1] = tmp;
            }
        }
        
    }
}
