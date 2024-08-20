class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>(Collections.nCopies(rowIndex + 1, 0));
        result.set(0, 1);

        for (int row = 1; row <= rowIndex; ++row) {
            result.set(row, 1);

            for (int index = row - 1; index > 0; --index) {
                result.set(index, result.get(index) + result.get(index - 1));
            }
        }

        return result;
    }
}