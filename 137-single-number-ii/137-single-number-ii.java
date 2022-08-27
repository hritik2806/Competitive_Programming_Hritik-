import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int i,j;
        int c=0,unset=0,ans=0;
     for(i=0;i<=31;i++){
         c=0;
         for(j=0;j<n;j++){
             if((1&(nums[j]>>i))==1){
                 c++;
             }
         }
         unset=n-c;
         if(c%3==1){
            ans=ans+(1<<i); 
         }
     }   
        
         return ans;      
    }
}