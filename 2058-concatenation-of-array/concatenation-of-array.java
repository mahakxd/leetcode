class Solution {
    public int[] getConcatenation(int[] nums) {
       
        int[] resultantArr = new int[2*nums.length];
       
        for(int i = 0; i < resultantArr.length; i++) {
            
            resultantArr[i] = nums[i%nums.length];
        }
        return resultantArr;
    }
}