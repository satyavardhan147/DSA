import java.io.*;
import java.util.*;


class Solution {
    
    public int[] maxSlidingWindow(int[] nums, int k) {
          
        int[] ans = new int[nums.length-k+1];
        
        if(nums.length == 1)
        {
           ans[0] = nums[0];
           return ans; 
        }
        
        int index = 0; 
        Deque<Integer> que = new ArrayDeque<>();
        
        for(int i = 0 ; i < nums.length ; i++)
        {
            
            
            if(!que.isEmpty() && que.peek() <= i-k)
            {
                que.poll();
            }
            
            while(!que.isEmpty() && nums[que.peekLast()] < nums[i])
            {
                que.pollLast();
            }
            
            que.offer(i);
            
            if(i >= k-1)
            {
                ans[index++] = nums[que.peek()];
            }
            
        }
        
        return ans;
    }
}
