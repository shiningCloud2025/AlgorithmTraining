package hot10;

/**
 * 5.盛水最多的容器
 * @author shiningCloud2025
 */
public class Solution5 {
    public int maxArea(int[] height) {
        int res = 0;
        int l=0,r=height.length-1;
        while(l<r){
            res = Math.max(res,(r-l)*Math.min(height[l],height[r]));
            if(height[l]<height[r]) l++;
            else r--;
        }
        return res;
    }
}
