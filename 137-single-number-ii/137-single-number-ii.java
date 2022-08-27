import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int i;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(i=0;i<n;i++){
            if(map.containsKey(nums[i])){
              map.put(nums[i],map.get(nums[i])+1);
            }
        else
                map.put(nums[i],1);
        
    }
        for(i=0;i<n;i++){
            if(map.get(nums[i])==1){
                return nums[i];
            }
        }
       return 0;
    }
    
}