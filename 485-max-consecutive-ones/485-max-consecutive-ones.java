class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int m=Integer.MIN_VALUE;
        int i;
        for(i=0;i<n;i++){
            if(nums[i]==0)
                nums[i]=m;
        }
        int max_sum=Integer.MIN_VALUE;
        int current=0;
        for(i=0;i<n;i++){
            current=current+nums[i];
            max_sum=Math.max(current,max_sum);
            if(current<0){
                current=0;
            }
        }
        if(max_sum==Integer.MIN_VALUE)
            return 0;
        return max_sum;
    }
}