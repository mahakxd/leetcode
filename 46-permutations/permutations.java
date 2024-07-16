class Solution {
    public void req(List<List<Integer>> list, List<Integer> curList, List<Integer> first, int ind)
    {
        List<Integer> tmp = new LinkedList<>(curList);
        List<Integer> tmpFirst = new LinkedList<>(first);
        tmp.add(tmpFirst.get(ind));
        tmpFirst.remove(ind);

        if (tmpFirst.size() > 0)
        {
            for (int i = 0; i < tmpFirst.size(); i++)
                req(list, tmp, tmpFirst, i);
        }
        else
            list.add(tmp);

    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> fullList = new LinkedList<>();
        for (int m : nums)
            fullList.add(m);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            req(list, new LinkedList<>(), fullList, i);
        return list;
    }
}