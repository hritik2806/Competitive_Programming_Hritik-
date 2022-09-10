class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int i;
        Arrays.sort(nums);
        
        return nums[n/2];
        
    }
}