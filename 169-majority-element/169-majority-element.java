class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int i;
         int maj=-1;
        int count=0;
        for(i=0;i<n;i++){
            if(count==0){
                maj=nums[i];
            count++;
                }
            else if(maj!=nums[i])
                count--;
            else
                count++;
        }
        return maj;
    }
}