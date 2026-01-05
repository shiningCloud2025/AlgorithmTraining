package hot10;

import java.util.*;

/**
 * 6.三数之和
 * @author shiningCloud2025
 */
public class Solution6 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new LinkedList();
        Set<Integer> set = new HashSet();
        Map<String,List<Integer>> map = new HashMap();
        for(int i=0;i<=nums.length-3;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                int target = -nums[i];
                Set<Integer> set1 = new HashSet();
                for(int j=i+1;j<nums.length;j++){
                    if(set1.contains(target-nums[j])){
                        List list = Arrays.asList(nums[i],nums[j],target-nums[j]);
                        Collections.sort(list);
                        String str = list.get(0)+","+list.get(1)+","+list.get(2);
                        if(map.containsKey(str)){
                            continue;
                        }else{
                            map.put(str,list);
                        }
                    }else{
                        set1.add(nums[j]);
                    }
                }
            }else{
                continue;
            }
        }
        for(String str : map.keySet()){
            res.add(map.get(str));
        }
        return res;
    }
}
