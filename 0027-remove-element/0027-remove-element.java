class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> numbersList = new ArrayList<>();

        for(int num: nums){
            numbersList.add(num);
        }

        while(numbersList.contains(val)){
            numbersList.remove(Integer.valueOf(val));
        }

        for(int i = 0; i< numbersList.size(); i++){
            nums[i] = numbersList.get(i);
        }

        return numbersList.size();
        
    }
}