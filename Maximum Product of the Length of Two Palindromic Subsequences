class Solution {
    
    static int ans;
    
    public boolean isPalindrome(String s)
    {
      for(int i = 0 ,j = s.length() - 1 ; i <= j; i++,j--)
      {
 
        if(s.charAt(i) != s.charAt(j))
        {
            return false;
        }
          
      }
        
        return true;
    }
    
    public void getMaxProduct(int index , String p , String q , String s)
    {
           if(index >= s.length())
           {
               if(isPalindrome(p) && isPalindrome(q))
               {
                   ans = Math.max(ans,p.length() * q.length());
               }
               
               return ;
           }
        
           getMaxProduct(index+1,p,q,s);
        
           getMaxProduct(index+1,p+s.charAt(index),q,s);
        
           getMaxProduct(index+1,p,q+s.charAt(index),s);
    }
    
    public int maxProduct(String s) {
        
        ans = 0;
        String p = "";
        String q = "";
        getMaxProduct(0,p,q,s);
        return ans;
        
    }
}
