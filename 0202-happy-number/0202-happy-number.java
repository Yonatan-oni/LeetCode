class Solution {
    public boolean isHappy(int n) {
        boolean output = false;
        List<Integer> firstSum = toDigitConvertor(n);
        int result = 0;
        int count = 0;


        while(result != 1){
            result = 0;
            for(int sum : firstSum)
                result += sum *sum;
            if(result == 1){
                output = true;
                break;
            }else if( count == (2^31 -1))
                break;
            firstSum = toDigitConvertor(result);
            count++;

        }

        return output;
    }

    private List<Integer> toDigitConvertor(int num){
        List<Integer> digits = new ArrayList<>();
        int remainder = 0;
        while(num != 0){
            remainder = num%10;
            if(remainder != 0)
                digits.add(remainder);
            else if(remainder == 0)
                digits.add(0);

            num = (num-remainder)/10;
        }
        return digits;
    }


}