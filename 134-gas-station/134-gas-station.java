class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i =0;i<gas.length;i++){
            if(gas[i] >= cost[i] && gas[i] != 0)
                arr.add(i);
        }
        
        for(Integer i: arr){
            int sum =0;
            int temp = i;
            do{
                if(sum + gas[temp%gas.length] >= cost[temp%gas.length]){
               sum+= gas[temp%gas.length] - cost[temp%gas.length];
                temp++;
                }
                else{
                    break;
                }
            }while(temp%gas.length != i);
            
            if(temp%gas.length==i && sum >= 0){
                return i;
            }
        }
        
        return -1;
    }
}