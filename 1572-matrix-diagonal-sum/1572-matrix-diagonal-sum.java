class Solution {
    public int diagonalSum(int[][] mat) {
        int res=0;
        for(int i=0;i<mat.length;i++){
            res+=mat[i][i];
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j) continue;
                if(i+j==mat[0].length-1){
                    res+=mat[i][j];
                }
            }
        }
        return res;
    }
}