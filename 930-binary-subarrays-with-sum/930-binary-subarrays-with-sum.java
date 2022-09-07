class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        int curr_sum = 0;
        int res = 0;
        
        for(int i=0;i<nums.length;i++){
            curr_sum += nums[i];
                        
            int remove_sum = curr_sum - goal;
            
            if(map.containsKey(remove_sum))
                res += map.get(remove_sum); 
            
            if(curr_sum == goal)
                res++;
            
            map.put(curr_sum,map.getOrDefault(curr_sum,0)+1);

        }
        
        return res;
    }
}