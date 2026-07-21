class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0;
        int r=matrix.length;
        while(l<r) {
            int m = (r+l)/2;
            if(matrix[m][0]==target) {
                return true;
            }
            else if(matrix[m][0]>target) {
                r=m;
            }
            else{
                l=m+1;
            }
        }
        l--;
        l=Math.max(l,0);
        int rowL =0;
        int rowR = matrix[0].length;
        while(rowL<rowR) {
            int m = (rowL+rowR)/2;
            if(matrix[l][m]==target) {
                return true;
            }
            else if(matrix[l][m]<target) {
                rowL = m+1;
            }
            else{
                rowR = m;
            }
        }

        return false;
        
    }
}
