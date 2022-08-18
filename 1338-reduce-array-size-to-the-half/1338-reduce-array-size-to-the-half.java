class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int half = arr.length/2;
        
        for(int a: arr){
            if(freq.containsKey(a))
                freq.put(a,freq.get(a)+1);
            else
                freq.put(a,1);
        }
        
        Pair [] pairarr = new Pair[freq.size()];
        
        int f=0;
        
        Iterator hmIterator = freq.entrySet().iterator();
        
        while (hmIterator.hasNext()) {
 
            Map.Entry mapElement
                = (Map.Entry)hmIterator.next();
            
            int frequency = (int)mapElement.getValue();
            int number = (int)mapElement.getKey();
 
            pairarr[f] = new Pair(number,frequency);
            f++;
        }
        
        Arrays.sort(pairarr, new Comparator<Pair>(){
            public int compare(Pair p1,Pair p2){
                return p1.freq.compareTo(p2.freq);
            }
        });
        
        int sum = 0;
        int num = 0;
        for(int i=pairarr.length-1;i>=0;i--){
            sum += pairarr[i].freq;
            num++;
            if(sum >= half){
                break;
            }
        }
        
        return num;
    }
    
    class Pair{
        Integer num;
        Integer freq;
        
        Pair(Integer num,Integer freq){
            this.num = num;
            this.freq = freq;
        }
    }
}