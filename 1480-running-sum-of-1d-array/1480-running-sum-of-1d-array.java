class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            // Update the current element by adding the previous element to it
            nums[i] = nums[i] + nums[i - 1]; 
        }
        return nums;
    }
}