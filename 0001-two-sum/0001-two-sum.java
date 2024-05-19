class Solution {
    public int[] twoSum(int[] nums, int target) {
        int num1 = 0;
        int num2 = 0;
        for(int i=0; i < nums.length; i++){
            for(int j=0; j < nums.length; j++){
                if(((nums[i] + nums[j]) == target)  && i!=j ){
                    num1 = i;
                    num2 = j;
                }
            }
     
        }
        int[] output = {num1, num2};
       return  output; 
    }
}