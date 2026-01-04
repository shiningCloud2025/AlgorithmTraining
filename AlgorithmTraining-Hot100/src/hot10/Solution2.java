package hot10;

import java.util.*;

/**
 * 2.字母异位词分组
 */
public class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new LinkedList();
        Map<String,List<String>> map = new HashMap();
        for(String str:strs){
            char[] cs = str.toCharArray();
            Arrays.sort(cs);
            String newStr = new String(cs);
            if(map.containsKey(newStr)){
                List<String> temp = new LinkedList<>();
                temp = map.get(newStr);
                temp.add(str);
                map.put(newStr,temp);
            }else{
                List<String> temp = new LinkedList<>();
                temp.add(str);
                map.put(newStr,temp);
            }
        }
        for(String str : map.keySet()){
            res.add(map.get(str));
        }
        return res;

    }
}
