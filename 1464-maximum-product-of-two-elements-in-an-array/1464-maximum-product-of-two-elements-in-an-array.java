class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int last=nums.length-1;
        int sec_last=nums.length-2;

       
        int ans = (nums[last] - 1) * (nums[sec_last] - 1);
        return ans;

    }
}