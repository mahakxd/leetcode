class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<pieces.length; i++){
            map.put(pieces[i][0], i);
        }
        int i=0;
        while(i< arr.length){
            if(map.containsKey(arr[i])){
                int[] piece = pieces[map.get(arr[i])];
                for(int p: piece){
                    if(arr[i++]!=p) return false;
                }
            }
            else return false;
        }
        return true;
    }
}