class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int [] pchars = new int[26];
        
        for(int i =0;i<p.length();i++){
            pchars[p.charAt(i) - 'a']++;
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<=s.length()-p.length();i++){
            int []schars = new int[26];
            
            for(int j =i;j<i+p.length();j++){
            schars[s.charAt(j) - 'a']++;
            }
            
            if(Arrays.equals(schars,pchars))
                ans.add(i);
        }
        
        return ans;
    }
}