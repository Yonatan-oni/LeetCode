class Solution {
    public int reverse(int x) {
        int remainder;
        int reversedNumber = 0;
        List<Integer> digits = new ArrayList();

        while(x != 0){
            remainder = x%10;
            if(remainder != 0)
                digits.add(remainder);
            else if(remainder == 0)
                digits.add(0);

            x = (x-remainder)/10;
        }

        for(int i = 1; i <= digits.size(); i++){
             if((digits.get(i-1) * Math.pow(10, digits.size() - i)) < Math.pow(-2, 31)  || 
                (digits.get(i-1) * Math.pow(10, digits.size() - i)) > (Math.pow(2, 31) -1)){
                reversedNumber = 0;
                break;
             }else if ( (reversedNumber <= Math.pow(-2, 31) || 
                reversedNumber >= (Math.pow(2, 31) -1))){
                reversedNumber = 0;
                break;
             }else{
                reversedNumber += digits.get(i-1) * Math.pow(10, digits.size() - i);
             }

        }
        
        return reversedNumber;
    }
}