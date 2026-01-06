package hot10;

import java.util.LinkedList;
import java.util.List;

/**
 * 9.找到字符串中所有字母异位词
 * @author shiningCloud2025
 */
public class Solution9 {
    public List<Integer> findAnagrams(String s, String p) {
        // TODO:一个非常典型的定滑动窗口问题,主要需要注意的是
        //  1.考虑p字符串大于s
        //  2.先处理与p同大小的窗口,方便后续移动
        //  3.移动的时候要在p的下一位,因为初始窗口已经处理好了
        List<Integer> res = new LinkedList();
        int[] s_ns = new int[256];
        int[] p_ns = new int[256];
        if(s.length()<p.length()){
            return res;
        }
        for(int i=0;i<p.length();i++){
            s_ns[s.charAt(i)]++;
            p_ns[p.charAt(i)]++;
        }
        if(check(s_ns,p_ns)) res.add(0);
        for(int l=0,r=p.length();r<s.length();r++){
            s_ns[s.charAt(r)]++;
            s_ns[s.charAt(l++)]--;
            if(check(s_ns,p_ns)) res.add(l);
        }
        return res;


    }
    public boolean check(int[] s_ns,int[] p_ns){
        for(int i=0;i<256;i++){
            if(s_ns[i]!=p_ns[i]) return false;
        }
        return true;
    }
}
