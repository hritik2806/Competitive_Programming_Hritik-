class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int max=-1;
        int count=0;
        int i;
        for(i=0;i<n;i++){
            if(nums[i]==1){
                count=count+1;
            }
            else
                count=0;
            if(max<count)
                max=count;
        }
                
            return max;
    }
}