package hot10;

import java.util.HashSet;
import java.util.Set;

/**
 * 8.无重复字符的最长子串
 * @author shiningCloud2025
 */
public class Solution8 {
    public int lengthOfLongestSubstring(String s) {
        // TODO:核心思路其实是先判断是否有重复，有的话左指针右移,没有重复的话，右移统计即可
        int res = 0;
        Set<Character> set = new HashSet();
        char[] cs = s.toCharArray();
        for(int l=0,r=0;r<cs.length;r++){
            while(l<r&&set.contains(cs[r])){
                set.remove(cs[l++]);
            }
            set.add(cs[r]);
            res = Math.max(res,r-l+1);
        }
        return res;
    }
}
