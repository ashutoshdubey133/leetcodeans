class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        int lowd = digits(low);
        int highd = digits(high);
        
        int temp = lowd;
        
        String str = "123456789";
        List<Integer> ans = new ArrayList<>();
            
        for(;temp<=highd;temp++){
            
            int j = 0;
            for(;j+temp<=9;j++){
                int z = Integer.parseInt(str.substring(j,j+temp));
                if(z<low){
                    continue;
                }
                
                if(z > high)
                    break;
                ans.add(z);
            }
            
            if(j+temp!=10){
                break;
            }
            
        }
        
        return ans;
        
        
    }
    
    int digits(int x){
        String str = Integer.toString(x);
        return str.length();
    }
}