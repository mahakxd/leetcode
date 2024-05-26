class Solution {
    public int minOperations(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        if(n1<n2) {
            
            return minOperations(nums2, nums1);
        }
        
        if(n1>n2*6) {
            return -1;
        }
        int[] freq1 = new int[7], freq2 = new int[7];
        int sum1 = 0, sum2 = 0;
        for(int num: nums1) {
            freq1[num]++;
            sum1+=num;
        }
        for(int num: nums2) {
            freq2[num]++;
            sum2+=num;
        }
        if(sum1>sum2) {
            return solve(freq1, freq2, sum1, sum2);
        }
        return solve(freq2, freq1, sum2, sum1);
    }

    //always take sum1 as max value for ease of calculation
    int solve(int[] freq1, int[] freq2, int sum1, int sum2) {
        int i = 6, j = 1, ops = 0;
        while(i>=1 && j<=6 && sum1!=sum2) {
            while(i>=1 && freq1[i]==0) {
                i--;
            }
            while(j<=6 && freq2[j]==0) {
                j++;
            }
            //f1 = taking highest value from nums1 i=6, 5, 4, 3, 2, 1 and try to make it to 1
            //f2 = taking lowest value from nums2 j=1, 2, 3, 4, 5, 6 and try to make it to 6
            int f1 = i-1, f2 = 6-j, diff = sum1-sum2;
            if(f1>=f2) {
                //decrease
                int highestValue = f1*freq1[i]; 
                if(diff<=highestValue) {
                    ops+=(int)Math.ceil(diff*1.0/f1);
                    sum1-=diff;
                } else {
                    sum1-=highestValue;
                    ops+=freq1[i];
                }
                i--;
            } else {
                int lowestValue = f2*freq2[j];
                if(diff<=lowestValue) {
                    //diff is lesser than number of frequency of (6-j) 
                    ops+=(int)Math.ceil(diff*1.0/f2);
                    sum2+=diff;
                } else {
                    sum2+=lowestValue;
                    ops+=freq2[j];
                }
                j++;
            }
        }
        return ops;
    }
}