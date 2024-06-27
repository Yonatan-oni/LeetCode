class Solution {
    public void moveZeroes(int[] nums) {
        
        int counter = 0;
        for(int i = 0; i < nums.length; i++){
            int count = i;
            int n = -1;
        if(nums[i] == 0){
            if(i +1 < nums.length && nums[i] == nums[i+1])
                n = i;
            
            while(count +1 < nums.length){
                nums[count] = nums[count +1];
                count++;
            }
            
            nums[nums.length -1 ] = 0;

            if(n == i && i != nums.length-2)
                i = n - 1;

        }
            
        counter++;
        if(counter > nums.length*2 )
            break;

        }
        
    }
}