class Solution {
    public int romanToInt(String s) {
        int output = 0;
        String[] letters = s.split("");
        for(int i = 0; i < letters.length; i++){
            if(letters[i].equals("I"))
                output += 1;
            else if(i !=0 && letters[i].equals("V") && letters[i-1].equals("I"))
                output += 3;
            else if(letters[i].equals("V"))
                output += 5;

            else if(i !=0 && letters[i].equals("X") && letters[i-1].equals("I"))
                output += 8;
            else if(letters[i].equals("X"))
                output += 10;


            else if(i !=0 && letters[i].equals("L") && letters[i-1].equals("X"))
                output += 30;
            else if(letters[i].equals("L"))
                output += 50;

            else if(i !=0 && letters[i].equals("C") && letters[i-1].equals("X"))
                output += 80;
            else if(letters[i].equals("C"))
                output += 100;


            else if(i !=0 && letters[i].equals("D") && letters[i-1].equals("C"))
                output += 300;
            else if(letters[i].equals("D") )
                output += 500;

            else if(i !=0 && letters[i].equals("M") && letters[i-1].equals("C"))
                output += 800;
            else if(letters[i].equals("M"))
                output += 1000;
        }

        return output;
    }
}