class Solution {
    public int uniquePaths(int m, int n) {
        int [][]arr = new int[m][n];
        arr[m-1][n-1] = 1;
        
        for(int i=arr.length-1;i>=0;i--){
            for(int j=arr[i].length-1;j>=0;j--){
                if(i==arr.length-1){
                    if(j==arr[i].length-1)
                        continue;
                    
                    arr[i][j] = arr[i][j+1];
                }
                else if(j==arr[i].length-1)
                    arr[i][j] = arr[i+1][j];
                else
                arr[i][j] = arr[i][j+1] + arr[i+1][j];
            }
        }
        
        return arr[0][0];
        
    }
}