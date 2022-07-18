class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rowcols = new ArrayList<Integer>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    rowcols.add(i);
                    rowcols.add(j);
                }
            }
        }
        
        for(int i=0;i<rowcols.size();i+=2){
            int row = rowcols.get(i);
            for(int j = 0;j<matrix[row].length;j++){
                matrix[row][j] = 0;
            }
        }
        
        for(int i=1;i<rowcols.size();i+=2){
            int cols = rowcols.get(i);
            for(int j = 0;j<matrix.length;j++){
                matrix[j][cols] = 0;
            }
        }
    }
}