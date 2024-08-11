class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> TriangleArr = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> Row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j==i) {
                    Row.add(1);
                } else {
                    int sum = TriangleArr.get(i - 1).get(j - 1) + TriangleArr.get(i - 1).get(j);
                    Row.add(sum);
                }

            }
            TriangleArr.add(Row);

        }

        return TriangleArr.get(rowIndex);

    }
}
