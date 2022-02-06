class Solution {
    public int removeDuplicates(int[] a) {
        if(a.length == 0 || a.length == 1){
            return a.length;
        }
        int i = 1;
        int j = 1;
        
        for(;j<a.length;j++){
            if(a[j] != a[j-1]){
                a[i] = a[j];
                i++;
            }
        }
        
        return i;
    }
        
}