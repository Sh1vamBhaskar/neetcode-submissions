class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int[] sec = new int [nums.length];
        int[] ans = new int[nums.length + sec.length];
        for(int i=0;i<nums.length;i++) {
            sec[i] = nums[i];
        }
        System.arraycopy(nums ,0,ans,0,nums.length);
        System.arraycopy(sec,0,ans,nums.length,nums.length);
        return ans;
    
    }
}