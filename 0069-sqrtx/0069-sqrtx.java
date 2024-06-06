class Solution {
    public int mySqrt(int x) {
        int output = 0;
        int counter = 1;
        while( (counter * counter) <= x && (counter * counter) > output  ){
            output = counter;
            counter++;
         
        }
        return output;
    }
}