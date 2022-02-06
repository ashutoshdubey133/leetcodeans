class Solution {
    public int removeDuplicates(int[] a) {
        if(a.length == 0 || a.length == 1){
            return a.length;
        }
        int i = 0;
        int j = 1;
        int temp = Integer.MIN_VALUE;
        
        for(;a[i]>temp;i++){
            while(j<a.length && a[i] == a[j])
                j++;
            if(j<a.length) {
            a[i+1] = a[j];
            temp = a[i];
            }else {
            	break;
            }
        }
        
        return i+1;
        
    }
}