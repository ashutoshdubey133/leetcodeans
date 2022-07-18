class Solution {
    public void nextPermutation(int[] nums) {
         int num = -1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i] > nums[i-1]){
                num = i-1;
                break;
            }
        }

        if(num == -1) {
            Arrays.sort(nums);
            return;
        }

        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] > nums[num]){
                int temp = nums[i];
                nums[i] = nums[num];
                nums[num] = temp;
                break;
            }
        }

        for(int i =num+1,j=nums.length-1;i<=(nums.length+num)/2;i++,j--){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return;
    }
}