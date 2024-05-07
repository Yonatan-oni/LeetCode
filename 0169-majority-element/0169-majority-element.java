class Solution {
    public int majorityElement(int[] nums) {
        List<Integer> numList = new ArrayList<>();
        for(int num: nums){
            numList.add(num);
        }

        int maxCount =0;
        int maxFreq = numList.get(0);
        int value = 0;
        while(!numList.isEmpty()){
            value = numList.get(0);
            numList.remove(numList.get(0));

            int count = 0;
            while( numList.contains(value) ){
                numList.remove(numList.get(numList.indexOf(value)));         
                count++;
            }
            if(count > maxCount){
                maxCount = count;
                maxFreq = value;
            }
        }
    
        return maxFreq;
        
    }
}