package hot20;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 14.合并区间
 * @author shiningCloud2025
 */
public class Solution14 {
    public int[][] merge(int[][] intervals) {
        // TODO:整体来说还是比较简单的,就是基本的数组操作,需要注意的点:
        //  1.临时结果集记得用List包数组,因为数组确定的,List不定
        //  2.一定要记得先把数组按照一维数组的首数排序
        //  3.如果可以合并就先删除合并，不能合并直接删除就可以
        List<int[]> list = new LinkedList();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        list.add(intervals[0]);
        int m = intervals.length;
        int n = intervals[0].length;
        for(int i=1;i<m;i++){
            int[] oldArr = list.get(list.size()-1);
            int oldLeft = oldArr[0];
            int oldRight = oldArr[1];
            int[] newArr = intervals[i];
            int newLeft = newArr[0];
            int newRight = newArr[1];
            if(newLeft<=oldRight){
                list.remove(list.size()-1);
                list.add(new int[]{oldLeft,Math.max(oldRight,newRight)});
            }else{
                list.add(new int[]{newLeft,newRight});
            }
        }
        int[][] res = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
