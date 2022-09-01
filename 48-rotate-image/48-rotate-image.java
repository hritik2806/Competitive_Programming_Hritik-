class Solution {
    public void rotate(int[][] matrix) {
        int i,j;
        int temp=0;
        int n=matrix.length;
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(i=0;i<n;i++){
            int l=0,r=n-1;
            while(l<=r){
                temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
                l++;
                r--;
            }
        }
    
    }
}