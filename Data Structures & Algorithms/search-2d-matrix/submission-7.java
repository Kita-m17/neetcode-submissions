class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;

        int top = 0, bottom = rows - 1;
        int l = 0, r = cols - 1;

        while(top <= bottom){
            int row = top + (bottom-top)/2;
            if(target > matrix[row][cols - 1]){
                top = row + 1;
            }else if(target < matrix[row][0]){
                bottom = row - 1;
            }else{
                break;
            }
        }

        if(top>bottom){
            return false;
        }

        int row = top + (bottom-top)/2;
        while(l<=r){
            int col = l+(r-l)/2;
            if(matrix[row][col] < target) {
                l = col + 1;
            }else if(matrix[row][col] > target){
                r = col - 1;
            }else{
                return true;
            }
        }

        return false;
    }

    // public int search(int[][] matrix, int target, int l, int r){
    //     if(l>r) return -1;
    //     int mid = l + (r-l)/2;
    //     if(matrix)
        
    // }
}
