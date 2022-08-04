class Solution {
    public int maximumUnits(int[][] boxTypes, int trucksize) {
        
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        
        int units = 0;
        int i=0;
        
        while(trucksize != 0 && i<boxTypes.length){
            int a = Math.min(trucksize,boxTypes[i][0]);
            units += a*boxTypes[i][1];
            trucksize -= a;
            i++;
        }
        
        return units;
    }
}