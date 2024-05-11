class Solution {
    public boolean divideArray(int[] nums) {
        int x=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i=i+2)
        { if(nums[i]!=nums[i+1])
           x++;
        }
        if(x==0)
        return true;
        else 
        return false;
        
    }
}