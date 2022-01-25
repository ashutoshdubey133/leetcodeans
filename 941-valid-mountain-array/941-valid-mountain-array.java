class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length <3) return false;
        
        int i =0,j=arr.length-1;
        while(i<arr.length-1){
            if(arr[i+1] > arr[i]){
                i++;
            }
            else{
                break;
            }
        }
        while(j>0){
            if(arr[j-1] > arr[j]){
                j--;
            }else{
                break;
            }
        }
        
        return i>0 && (i==j) && j<arr.length-1;
    }
}