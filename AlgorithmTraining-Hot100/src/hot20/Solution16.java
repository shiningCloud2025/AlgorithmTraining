package hot20;

/**
 * 16.除了自身以外数组的乘积
 */
public class Solution16 {
    public int[] productExceptSelf(int[] nums) {
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
