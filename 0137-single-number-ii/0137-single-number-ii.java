class Solution {
    public int singleNumber(int[] nums) {
        int number = 0;
        int counter = 0;
        List<Integer> notAnswer = new ArrayList();

        for(int i =0; i < nums.length; i++){
            counter = 0;
            for(int j=0; j < nums.length; j++){
               while(counter<(nums.length)){
                if( i != j && nums[i] == nums[j])
                    notAnswer.add(nums[j]);
                j++;
                counter++;
               }
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(!notAnswer.contains(nums[i]))
                number = nums[i];
        }

        return number;
        
    }
}