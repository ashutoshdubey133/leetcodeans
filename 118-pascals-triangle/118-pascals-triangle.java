class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);

        for(int i=2;i<=numRows;i++){
            List<Integer> temp = new ArrayList<>(i);
            temp.add(1);
            for(int j=2;j<=i-1;j++){
                int a = result.get(i-2).get(j-2) + result.get(i-2).get(j-1);
                temp.add(a);
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }
}