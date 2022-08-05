class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Stack<Integer> st = new Stack<>();
        
        st.push(nums2[nums2.length-1]);
        HashMap<Integer,Integer> nge = new HashMap<>();
        nge.put(nums2[nums2.length-1],-1);
        for(int i=nums2.length-2;i>=0;i--){
            while(st.size()>0 && st.peek() < nums2[i])
                st.pop();
            
            int next = 0;
            
            if(st.size() == 0)
                next = -1;
            else
                next = st.peek();
            
            st.push(nums2[i]);
            nge.put(nums2[i],next);
        }
        
        for(int i=0;i<nums1.length;i++){
            nums1[i] = nge.get(nums1[i]);
        }
        
        return nums1;
    }
}