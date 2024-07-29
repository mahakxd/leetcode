class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> mergedIntervals = new ArrayList<>();
        int n = intervals.length;
        int i = 0;

        // Add all intervals before the newInterval starts
        while (i < n && intervals[i][1] < newInterval[0]) {
            mergedIntervals.add(intervals[i]);
            i++;
        }

        // Merge all overlapping intervals with newInterval
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        // Add the merged newInterval
        mergedIntervals.add(newInterval);

        // Add all the remaining intervals
        while (i < n) {
            mergedIntervals.add(intervals[i]);
            i++;
        }

        // Convert the list to a 2D array
        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}



