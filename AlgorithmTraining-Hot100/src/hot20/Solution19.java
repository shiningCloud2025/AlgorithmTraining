package hot20;

import java.util.LinkedList;
import java.util.List;

/**
 * 19.螺旋矩阵
 * @author shiningCloud2025
 */
public class Solution19 {
    public List<Integer> spiralOrder(int[][] matrix) {
        // TODO:需要注意的点是:
        //  1.这个题的思路是从左上到右下
        //  2.如果l==r&&t==b这个时候是没有后两步的
        //  3.处理完后进行迭代
        List<Integer> res = new LinkedList();
        int m = matrix.length,n=matrix[0].length;
        int l=0,t=0,r=n-1,b=m-1;
        while(l<=r&&t<=b){
            for(int i=l;i<=r;i++){
                res.add(matrix[t][i]);
            }
            for(int i=t+1;i<=b;i++){
                res.add(matrix[i][r]);
            }
            if(l<r&&t<b){
                for(int i=r-1;i>l;i--){
                    res.add(matrix[b][i]);
                }
                for(int i=b;i>t;i--){
                    res.add(matrix[i][l]);
                }
            }
            l++;
            t++;
            r--;
            b--;
        }
        return res;
    }
}
