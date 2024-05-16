class Solution {
    public int removeDuplicates(int[] nums) {
        int[] expectedNums = new int[nums.length];
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbersFilter = new ArrayList<>();
        List<Integer> removedNumbers = new ArrayList<>();
        int k = 0;
        
        for(int num: nums){
            numbers.add(num);
            numbersFilter.add(num);
        }

        for( int i = 0;  i < numbers.size() ; i++){
            for( int j = 0;  j < numbers.size() ; j++){
                if(numbers.get(i) == numbers.get(j) && i != j ){
                    removedNumbers.add(numbers.get(i));
                    numbers.remove(j);
                    numbersFilter.remove(j);
                }
            }
        }

        for( int i = 0;  i < numbers.size() ; i++){
            for( int j = 0;  j < numbers.size() ; j++){
                if(numbers.get(i) == numbers.get(j) && i != j ){
                    removedNumbers.add(numbers.get(i));
                    numbers.remove(j);
                    numbersFilter.remove(j);
                }
            }
        }

        for( int i = 0;  i < numbers.size() ; i++){
            for( int j = 0;  j < numbers.size() ; j++){
                if(numbers.get(i) == numbers.get(j) && i != j ){
                    removedNumbers.add(numbers.get(i));
                    numbers.remove(j);
                    numbersFilter.remove(j);
                }
            }
        }

        for(int i = 0; i < numbersFilter.size(); i++){
            expectedNums[i] = numbersFilter.get(i);      
        }
        
        k = numbersFilter.size();
        for (int i = 0; i < k; i++) {
            nums[i] = expectedNums[i];
        }
        return k;
    }
}