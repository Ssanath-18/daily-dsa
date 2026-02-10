class Solution {
    public boolean searchMatrix(int [][] matrix , int key ){
        int m = matrix.length;
        int n = matrix[0].length;
        
        int low = 0;
        int high = m * n -1;


        while (low <=  high){
            int mid = low + (high - low ) /2;
            int row = mid /n;
            int col = mid % n;
            int midVal =  matrix[row][col];

            if (midVal == key ){
                return true;

            } else if (midVal < key ){
                low = mid +1 ;

            } else {
                high = mid-1;
            }
        }
        return false;
    }
}