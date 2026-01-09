package hot20;

/**
 * 18.矩阵置零
 * @author shiningCloud2025
 */
public class Solution18 {
    public void setZeroes(int[][] matrix) {
        // TODO:这个题是简单的标记法问题,核心是通过两个数组去通过1来标记哪些行应该为0,然后遍历标记为0就可以
        int m = matrix.length,n = matrix[0].length;
        int[] hang = new int[m];
        int[] column = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    hang[i] = 1;
                    column[j] = 1;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(hang[i]==1||column[j]==1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
