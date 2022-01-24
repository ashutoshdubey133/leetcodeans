class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.charAt(0) >= 96){
            for(int j = 1;j<word.length();j++){
                if(word.charAt(j) <96)
                    return false;
            }
            
            return true;
        }
        
        if(word.charAt(0) <96){
            if(word.length() == 1){
                return true;
            }
            
            if(word.charAt(1) < 96){
                for(int j =2;j<word.length();j++){
                    if(word.charAt(j) >=96)
                        return false;
                }
                return true;
            }
            
            for(int j =1;j<word.length();j++){
                if(word.charAt(j) <96)
                    return false;
            }
            
        }
        
        return true;
    }
}