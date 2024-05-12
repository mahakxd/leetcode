class Solution {
    public int[] runningSum(int[] nums) {
        int j=0;
        int muns[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            j=j+ nums[i];
            muns[i]=j;

        }
    return muns;
    }
}