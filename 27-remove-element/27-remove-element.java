class Solution {
    public int removeElement(int[] nums, int val) {
        int temp = Integer.MAX_VALUE;
        int res = nums.length;
        
        for(int i = 0;i<nums.length;i++){
            if(nums[i] ==  val){
                nums[i] = temp;
                res--;
            }
        }
        
        Arrays.sort(nums);
        
        return res;
    }
}