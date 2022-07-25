class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int []res = new int[]{-1,-1};
        
        while(start <= end){
            int mid = (start+end)/2;
            
            if(nums[mid] > target)
                end = mid-1;
            
            if(nums[mid] < target)
                start = mid+1;
            
            if(nums[mid] == target){
                res[0] = mid;
                end = mid-1;
            }
                
        }
        
        start = 0;
        end = nums.length-1;
        
        while(start <= end){
            int mid = (start+end)/2;
            
            if(nums[mid] > target)
                end = mid-1;
            
            if(nums[mid] < target)
                start = mid+1;
            
            if(nums[mid] == target){
                res[1] = mid;
                start = mid+1;
            }        
        }
        
        return res;
    }
}