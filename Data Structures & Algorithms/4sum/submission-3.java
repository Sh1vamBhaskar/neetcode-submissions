class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(nums.length == 0 ) return ans;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long target_2 = (long)target - nums[i] - nums[j];

                int start = j+1;
                int end = nums.length-1;

                while(start<end) {
                    long sum_2 = (long)nums[start] + nums[end];
                    if(sum_2 < target_2) {
                        start ++;
                    } else if(sum_2 > target_2) {
                        end--;
                    } else{
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[start]);
                        quad.add(nums[end]);
                        ans.add(quad);

                        //for removing duplicacy for elemntsstarting from j+1
                        while(start<end && nums[start] == quad.get(2)) ++start;

                         //for removing duplicacy for elemnts starting from end in backward
                        while(start<end && nums[end] == quad.get(3))  --end;
                    }
                }
                //for removing duplicacy for elemnts starting from i
                while(j+1 < nums.length && nums[j+1] == nums[j]) ++j;
            }
            //for removing duplicacy for elemntsstarting from j
            while(i+1 < nums.length && nums[i+1] == nums[i])  ++i;
        }
        return ans;         
    }
}