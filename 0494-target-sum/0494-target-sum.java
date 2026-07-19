class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums, target, 0, 0);
    }

    int helper(int[] nums, int target, int index, int sum) {

       
        if (index == nums.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }

       
        int add = helper(nums, target, index + 1, sum + nums[index]);

       
        int subtract = helper(nums, target, index + 1, sum - nums[index]);

        
        return add + subtract;
    }
}