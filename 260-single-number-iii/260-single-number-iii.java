class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int i;
        int xor=0;
        for(i=0;i<nums.length;i++){
            xor=xor^nums[i];
        }
        int pos=-1;
        for( i=0;i<=31;i++){
            if((1&(xor>>i))==1){
               pos=i;
                break;
            }
        }
               int set=0,unset=0;
               for(i=0;i<n;i++){
                   if((1&nums[i]>>pos)==1)
                       set^=nums[i];
                   else
                       unset^=nums[i];
               }
        int ans[]={set,unset};
               return ans;
    }
}