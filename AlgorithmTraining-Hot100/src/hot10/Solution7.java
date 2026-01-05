package hot10;

import java.util.Stack;

/**
 * 7.接雨水
 * @author shiningCloud2025
 */
public class Solution7 {
    public int trap(int[] height) {
        // TODO:主要有三个关键点
        //  1.记得位置差是需要-1的
        //  2.记得迭代lastNum
        //  3.记得要判断一个stack不为空的情况,而且记住一般stack是放最后的,因为不然会干扰逻辑
        int res = 0;
        Stack<Integer> stack = new Stack();
        for(int i=0;i<height.length;i++){
            int lastNum = 0;
            while(!stack.isEmpty()&&height[stack.peek()]<height[i]){
                int top = stack.pop();
                res += (i-top-1) * (height[top]-lastNum);
                lastNum = height[top];
            }
            if(!stack.isEmpty()){
                res += (i-stack.peek()-1)*(height[i]-lastNum);
            }

            stack.push(i);
        }
        return res;
    }
}
