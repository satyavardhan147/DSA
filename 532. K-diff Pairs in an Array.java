import java.io.*;
import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        
         HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            int no = nums[i];
            map.put(no , map.getOrDefault(no,0)+1);
        }
        
        int count = 0;
        
        if(k == 0)
        {
            for(Map.Entry m : map.entrySet())
            {
                if((Integer)m.getValue() > 1)
                {
                    count++;
                }
            }
        }
        
        else{
            
            for(Map.Entry m : map.entrySet())
            {
                if(map.containsKey((Integer)m.getKey()+k)){
                    count++;
                }
            }
            
        }
        
        return count;
    }
}
