class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int corr=0;
        int i=0,temp=0;
        while(i<n){
        if(nums[i]<=n&&nums[i]>=1){
             corr=nums[i]-1;
            if(nums[corr]!=nums[i]){
                temp=nums[corr];
                nums[corr]=nums[i];
                nums[i]=temp;
            }
            else i++;
        }
         else
                i++;
    }
        for(i=0;i<n;i++){
            if(nums[i]-1!=i)
                return i+1;
        }
    return n+1;   
    }
}