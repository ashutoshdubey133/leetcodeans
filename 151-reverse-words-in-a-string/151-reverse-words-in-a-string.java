class Solution {
    public String reverseWords(String s) {
        Stack<String> reverser = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            while(i<s.length() && s.charAt(i) == ' ')
                i++;
            
            String temp = new String("");
            
            while(i<s.length() && s.charAt(i) != ' '){
                temp += Character.toString(s.charAt(i));
                i++;
            }
            if(reverser.size() != 0 && temp.length()>0)
                reverser.push(" ");
            reverser.push(temp);
        }
        
        String res = new String();
        
        int a = reverser.size();
        
        for(int i=0;i<a;i++){
            res += reverser.pop();
        }
        
        return res;
    }
}