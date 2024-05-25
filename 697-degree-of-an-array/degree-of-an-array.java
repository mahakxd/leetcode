class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>() , right = new HashMap<>() , count= new HashMap<>();
        for(int i=0;i< nums.length;i++){
            if(left.isEmpty() || !left.containsKey(nums[i])){
                 left.put(nums[i], i);
            }
            right.put(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i],0)+1);
        }
        int max = Collections.max(count.values());
        int min_length = nums.length;
        for(Map.Entry<Integer, Integer> entry : count.entrySet()){
            if(entry.getValue() == max){

                 min_length= Math.min(min_length, right.get(entry.getKey())-left.get(entry.getKey())+1);
            }
        }
        return min_length;
    }
}