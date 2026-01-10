package hot20;

/**
 * 20.旋转图像
 * @author shiningCloud2025
 */
public class Solution20 {
    public void rotate(int[][] matrix) {
        // TODO:这个题的核心是旋转,核心思路是从左上角转成左下角，同行行不变、同列列不变，然后交互行列,需要注意:
        //   1.行列分别是m/2和(m+1)/2
        int m = matrix.length;
        for(int i=0;i<m/2;i++){
            for(int j=0;j<(m+1)/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[m-1-j][i];
                matrix[m-1-j][i] = matrix[m-1-i][m-1-j];
                matrix[m-1-i][m-1-j] = matrix[j][m-1-i];
                matrix[j][m-1-i] = temp;
            }
        }
    }
}
