class Solution {
    public int[] twoSum(int[] nums, int target)
    
    {
        int i,j,p=0,q=0;
        for(i=0;i<nums.length;i++)
        {
            
            for(j=i+1;j<nums.length;j++)
            {
                if((nums[i]+nums[j])==target)
                {
                     p=i;
                    q=j;
                }
                
            }
            
        }
                int arr[]= {p,q}; 
    return arr; 
    }
}