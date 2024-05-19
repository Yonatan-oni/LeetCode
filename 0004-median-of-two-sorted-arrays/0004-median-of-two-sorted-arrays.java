class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Double> mergedNums = new ArrayList<>();
        double output = 0.0;
        
        for(int num: nums1)
            mergedNums.add((double)num);

        for(int num: nums2)
            mergedNums.add((double)num);
        
        Collections.sort(mergedNums);

        int length = mergedNums.size();
        if( (length % 2) == 0  )
            output =  (mergedNums.get((length/2) - 1)  +  mergedNums.get(((length/2))))/2;
        else if((length % 2) != 0)
            output = mergedNums.get( (  length - (int)Math.floor(length/2)  - 1) );  
        

        return output;
    }
}