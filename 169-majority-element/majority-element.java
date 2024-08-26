public class Solution {
    public int majorityElement(int[] nums) {
        //This line sorts the array nums in ascending order.
        Arrays.sort(nums);
       // After sorting, the method returns the element at the middle index of the array. In a sorted array, the majority element (the element that appears more than half the time) will always be at this position.
        return nums[nums.length / 2];
    }   
}