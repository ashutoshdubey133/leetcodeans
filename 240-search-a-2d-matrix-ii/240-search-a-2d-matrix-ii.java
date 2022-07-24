class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length-1;
        int n = arr[0].length-1;
        
        for(int i=0,j=n;i<=m && j>=0;){
            if(arr[i][j] == target)
                return true;
            
            if(arr[i][j] > target)
                j--;
            else
            i++;
        }
        
        return false;
    }
}