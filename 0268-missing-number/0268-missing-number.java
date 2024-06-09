class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        for(int num: nums)
            numbers.add(num);
        
        for(int i = 0; i <= nums.length; i++ ){
            if(!numbers.contains(i))
                return i;
        }

        return 0;
    }
}