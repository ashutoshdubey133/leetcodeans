class Solution {
    public int maxArea(int[] arr) {
        int max = Integer.MIN_VALUE;
        
        for(int i=0,j=arr.length-1;j>=0 && i <arr.length;){
            max = Math.max((j-i)*Math.min(arr[i],arr[j]),max);
            
            if(arr[i] > arr[j])
                j--;
            else
                i++;
        }
        
        return max;
    }
}