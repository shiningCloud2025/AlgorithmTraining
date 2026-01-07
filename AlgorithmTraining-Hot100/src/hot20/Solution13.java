package hot20;

/**
 * 13.最大子数组和
 * @author shiningCloud2025
 */
public class Solution13 {
    public int maxSubArray(int[] nums) {
        // TODO:这个题的核心是最大子数组,由于元素中有负数,所以放弃了滑动窗口(当然滑动窗口是可以做的,只不过只能过95%)
        //   核心思路:以nums中第i个为结尾的子数组,只有两种可能就是前i个+当前的和当前的 取最大就可以了 这样就保证数组变成了以i为结尾的最大子数组
        for(int i=1;i<nums.length;i++){
            nums[i] = Math.max(nums[i-1]+nums[i],nums[i]);
        }
        int res = -100010;
        for(int i=0;i<nums.length;i++){
            res = Math.max(res,nums[i]);
        }
        return res;
    }
}
