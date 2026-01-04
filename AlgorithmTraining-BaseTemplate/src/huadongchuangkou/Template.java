package huadongchuangkou;

/**
 * 滑动窗口模版
 * @author shiningCloud2025
 */
public class Template {
    // TODO:滑动窗口是一类常考的算法,也叫双指针法。主要用于解决:满足某个条件的连续子串/子区间/子数组问题
    //  注意:一般滑动窗口用于元素大于等于0的情况，如果有小于0是不适用的
    //  例题:给定一个数组nums和一个整数target,找出nums中满足和为target且长度最小的子数组。
    //   例如:nums=[3,2,3,2,5,6],target=11,输出2.其中保证nums[i]>0
    //  对于这个题,其实我最先想到的是双重for循环,这样的时间复杂度是O(n^2)
    //  但是其实这里是可以优化的。我们可以使用两个指针left和right
    //  如果Sum(left,right)>target,我们可以将left右移，如果Sum(left,right)<target,我们可以将right右移,如果刚好等于则更新最小值


    // TODO:滑动窗口模版代码

//    for(int l=0,r=0;r<n;r++){
//        while(l<=r&&check()){
//            l++;
//        }
//    }




    // TODO:滑动窗口例题代码
//    int[] nums;
//    int target;
//    int min_Length = Integer.MAX_VALUE;
//    for(int l=0,r=0,sum=0;r<nums.length;r++){
//        sum += nums[r];
//        while(l<=r&&sum>=target){
//            if (sum==target&&r-l+1<min_Length) min_Length = r-l+1;
//            sum -= nums[l++];
//        }
//    }
//    return min_Length;



}
