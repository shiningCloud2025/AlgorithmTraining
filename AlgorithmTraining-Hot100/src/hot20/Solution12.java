package hot20;

/**
 * 12.最小覆盖子串
 * @author shiningCloud2025
 */
public class Solution12 {
    public String minWindow(String s, String t) {
        // TODO:一个典型的滑动窗口问题,需要注意的点:
        //  1.要考虑到s小于t的情况
        //  2.要最小那么这个最小值要设为最大,两个字符串的数量都为10^5设置100010是很合适的
        //  3.由于要拼接字符串,所以更新的时候要更新最小值和l一起更新
        //  4.要考虑到不存在的情况,不存在的情况就很简单,就是没更新,即minNum==10010
        if(s.length()<t.length()) return "";
        int[] s_ns = new int[256];
        int[] t_ns = new int[256];
        for(int i=0;i<t.length();i++) t_ns[t.charAt(i)]++;
        int minNum = 100010;
        int minL = 0;
        for(int l=0,r=0;r<s.length();r++){
            s_ns[s.charAt(r)]++;
            while(l<=r&&check(s_ns,t_ns)){
                if(r-l+1<minNum){
                    minNum = r-l+1;
                    minL = l;
                }
                s_ns[s.charAt(l++)]--;
            }
        }
        if(minNum == 100010) return "";
        return s.substring(minL,minL+minNum);
    }
    public boolean check(int[] s_ns,int[] t_ns){
        for(int i=0;i<256;i++){
            if(s_ns[i]<t_ns[i]) return false;
        }
        return true;
    }
}
