class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        int temp = k;
        int []arr = new int [nums.length];
        for(int i =0 ;i<k;i++,temp--){
            arr[i] = nums[nums.length - temp];
        }
        temp =0;
        for(int i=k;i<arr.length;i++,temp++){
            arr[i] = nums[temp];
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = arr[i];
        }
    }
}