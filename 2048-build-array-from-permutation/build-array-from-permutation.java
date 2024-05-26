class Solution {
    public int[] buildArray(final int[] nums) {
        final int n = nums.length;
        final int[] ans = new int[n];

        for(int i = 0; i < n; ++i)
            ans[i] = nums[nums[i]];

        return ans;
    }
}
