class Solution {
    public int majorityElement(int[] nums) {
        int k = 0;
        int ctr = 0;
        for(int i =0 ;i < nums.length;i++) {
            if(ctr == 0) {
                k = nums[i];
            }
            if(nums[i] == k){
                ctr++;
            } else {
                ctr--;
            }
        }
        return k;
        
    }
}