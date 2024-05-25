class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int i=0,j=n-1;
        while(i<j){
            while(i<j && nums[i]%2==0)i++;
            while(i<j && nums[j]%2!=0)j--;
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        return nums;
    }
}