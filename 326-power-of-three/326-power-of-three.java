class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1)
            return true;
        else if(n==0 || n==2)
            return false;
        
        return (n%3==0 && isPowerOfThree(n/3));
    }
}