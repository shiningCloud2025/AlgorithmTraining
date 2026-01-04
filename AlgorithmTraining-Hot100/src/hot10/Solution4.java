package hot10;

/**
 * 4.移动零
 * @author shiningCloud2025
 */
public class Solution4 {
    // TODO:思路其实就两步:
    //  1.遍历数组，移动零下标，如果数组元素不为0，就放到0下标位置，然后向后移动一位
    //  2.这个位置的后面就都是0了，补充0就可以了

    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) continue;
            nums[j]=nums[i];
            j++;
        }
        for(int i=j;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}
