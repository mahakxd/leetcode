class Solution {
    public boolean canFormArray(int[] A, int[][] P) {
        Map<Integer, int[]> map = new HashMap<>(); //number -> left & right numbers
        
        for(int i = 0; i < P.length; ++i) {
            for(int j = 0; j < P[i].length;++ j) {
                
                int left = -1, right = -1;
                if(j > 0) {
                    left = P[i][j - 1];
                }
                if(j < P[i].length - 1) {
                    right = P[i][j + 1];
                }
                
                map.put(P[i][j], new int[] {left, right});
            }
        }
        
        for(int i = 0; i < A.length; ++i) {
            int left = -1, right = -1;
            if(i > 0) {
                left = A[i - 1];
            }
            if(i < A.length - 1) {
                right = A[i + 1];
            }
            
            if(!map.containsKey(A[i])) return false;
            
            var have = map.get(A[i]);
            if((have[0] > -1 && have[0] != left) || (have[1] > -1 && have[1] != right)) return false;
        }
        
        return true;
        
    }
}