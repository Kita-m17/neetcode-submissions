class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // return search(matrix, target, left, right)
        
        for(int i = 0; i<matrix.length; i++){
            if(Arrays.stream(matrix[i]).anyMatch(x -> x ==  target)){
                return true;
            }
        }
        return false;
    }

    // public int search(int[][] matrix, int target, int l, int r){
    //     if(l>r) return -1;
    // }
}
