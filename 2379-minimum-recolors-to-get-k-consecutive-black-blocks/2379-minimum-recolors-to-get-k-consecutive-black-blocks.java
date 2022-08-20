class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<blocks.length()-k+1;i++){
            int a = countWhites(blocks.substring(i,i+k));
            if(min > a)
                min = a;
        }
        return min;
    }
    
    public int countWhites(String str){
        int c= 0;
        for(int i=0;i<str.length();i++)
            if(str.charAt(i) == 'W')
                c++;
        
        return c;
    }
}