package hot20;


import java.util.Deque;
import java.util.LinkedList;

/**
 * 11.滑动窗口最大值
 * @author shiningCloud2025
 */
public class Solution11 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // TODO:滑动窗口的模版题,需要注意的是:
        //  1.要注意是Deque不是Queue
        //  2.要注意是getFirst和pollFirst 这是窗口滑动导致的
        //  3.对比尾巴,小的扔掉
        //  4.无论是单调栈还是单调队列里面存的都是索引而不是具体数据

        int[] res = new int[nums.length-k+1];
        Deque<Integer> q = new LinkedList();
        for(int i=0;i<nums.length;i++){
            if(!q.isEmpty()&&i-k>=q.getFirst()) q.pollFirst();
            while(!q.isEmpty()&&nums[q.getLast()]<nums[i]) q.pollLast();
            q.addLast(i);
            if(i+1-k>=0) res[i+1-k] = nums[q.getFirst()];
        }
        return res;
    }
}
