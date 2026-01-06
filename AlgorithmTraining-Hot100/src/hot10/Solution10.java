package hot10;

/**
 * 10.和为K的子数组
 * @author shiningCloud2025
 */
public class Solution10 {
    public int subarraySum(int[] nums, int k) {
        // TODO:由于题目的数据有小于等于0的,所以使用的是枚举滑窗,需要注意:
        //  1.需要考虑单独的那个数,因此会有temp<=r
        //  2.先统计再计算
        //  3.记得有退出机制
        int res = 0;
        for(int l=0,r=0,sum=0;r<nums.length;r++){
            sum += nums[r];
            int tempSum = sum;
            int tempL = l;
            while(tempL<=r){
                if(tempSum==k) res++;
                if(tempL<=r){
                    tempSum -= nums[tempL++];
                }else {
                    break;
                }
            }
        }
        return res;
    }
}
