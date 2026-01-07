package hot20;

import java.util.Arrays;

/**
 * 15.轮转数组
 * @author shiningCloud2025
 */
public class Solution15 {
    public void rotate(int[] nums, int k) {
        // TODO:需要注意的点:
        //  1.k要做处理,本质是因为如果k>=length的话,其实是一个周期了,是不用算的
        //  2.然后做整体调换和区间调换就可以了
        k = k%nums.length;
        reverse(0,nums.length-1,nums);
        reverse(0,k-1,nums);
        reverse(k,nums.length-1,nums);
    }
    public void reverse(int start,int end,int[] nums){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
