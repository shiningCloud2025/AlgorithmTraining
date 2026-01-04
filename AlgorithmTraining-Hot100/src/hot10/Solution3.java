package hot10;

import java.util.HashSet;
import java.util.Set;

/**
 * 3.最长连续序列
 * @author shiningCloud2025
 */
public class Solution3 {
    public int longestConsecutive(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        Set<Integer> set = new HashSet();
        for(int num : nums){
            set.add(num);
        }
        int res = 1;
        for(int num : set){
            if(set.contains(num-1)) continue;
            int count = 1;
            while(set.contains(num+1)){
                num++;
                count++;
                res = Math.max(res,count);
            }
        }
        return res;
    }

}
