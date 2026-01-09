package hot20;

/**
 * 17.缺失的第一个正数
 * @author shiningCloud2025
 */
public class Solution17 {
    public int firstMissingPositive(int[] nums) {
        // TODO:主要的思路就是对数组进行遍历,然后在1和nums.length中的数如果不在自已对应的位置就进行交换，最后进行核对，如果都正确就是少nums.length+1需要注意的是:
        //  1.1到nums.length范围内,不在自已的位置
        //  2.遍历数组进行确认,索引0对应的是数值1
        //  3.如果都存在是num.length+1不是0什么的
        for(int i=0;i<nums.length;i++){
            while(1<=nums[i]&&nums[i]<=nums.length&&nums[i]!=nums[nums[i]-1]){
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
}
