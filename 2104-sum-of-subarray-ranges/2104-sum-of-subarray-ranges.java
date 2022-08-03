class Solution {
    public long subArrayRanges(int[] nums) {
        long sum = 0;
        
        for(int i=0;i<nums.length-1;i++){
            int min = nums[i];
            int max = nums[i];
            for(int j=i+1;j<nums.length;j++){
                min = Math.min(min,nums[j]);
                max = Math.max(max,nums[j]);
                sum += max-min;
            } 
        }
        
        return sum;
    }
}