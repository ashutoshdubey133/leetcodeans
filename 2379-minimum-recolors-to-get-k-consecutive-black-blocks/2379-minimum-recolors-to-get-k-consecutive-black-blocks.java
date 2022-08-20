class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        
        int prev = 0;
        
        for(int i=0;i<k;i++){
            if(blocks.charAt(i) == 'W')
                prev++;
        }
        
        min = prev;
        
        for(int i=1;i<blocks.length()-k+1;i++){
            int curr = prev;
            
            if(blocks.charAt(i-1) == 'W')
                curr--;
            
            if(blocks.charAt(i+k-1) == 'W')
                curr++;
            
            if(curr < min)
                min = curr;
            
            prev = curr;
        }
        return min;
    }
}