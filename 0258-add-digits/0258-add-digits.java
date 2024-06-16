class Solution {
    public int addDigits(int num) {
        int result = separate(num);
        while( result > 9 )
            result = separate(result);        
        return result;
    }

    private int separate(int number){
        int remainder;
        List<Integer> digits = new ArrayList();
        while(number != 0){
            remainder = number%10;
            if(remainder != 0)
                digits.add(remainder);
            else if(remainder == 0)
                digits.add(0);
            number = (number-remainder)/10;
        }
        int output = 0;
        for(int digit: digits)
            output += digit;
        return output;
    }
}