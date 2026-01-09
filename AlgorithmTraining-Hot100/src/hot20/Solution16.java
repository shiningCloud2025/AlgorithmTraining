package hot20;

/**
 * 16.除了自身以外数组的乘积
 * @author shiningCloud2025
 */
public class Solution16 {
    public int[] productExceptSelf(int[] nums) {
        // TODO: 需要注意的点:
        //  1.第一个数的前缀和为1,不为0!!!
        //  2.最后一个数的后缀和为1,不为0!!
        //  3.其他数的前缀和就是前一个数的前缀和*前一个数
        int[] res = new int[nums.length];
        int[] frontJ = new int[nums.length];
        int[] lastJ = new int[nums.length];
        frontJ[0] = 1;
        lastJ[nums.length-1] = 1;
        for(int i=1;i<nums.length;i++){
            frontJ[i] = frontJ[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            lastJ[i] = lastJ[i+1]*nums[i+1];
        }
        for(int i=0;i<res.length;i++){
            res[i] = frontJ[i]*lastJ[i];
        }
        return res;
    }
}
