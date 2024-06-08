class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> output = new ArrayList<>();

        List<String> num2 = new ArrayList<>(Arrays.asList("a","b","c"));
        List<String> num3 = new ArrayList<>(Arrays.asList("d","e","f"));
        List<String> num4 = new ArrayList<>(Arrays.asList("g","h","i"));
        List<String> num5 = new ArrayList<>(Arrays.asList("j","k","l"));
        List<String> num6 = new ArrayList<>(Arrays.asList("m","n","o"));
        List<String> num7 = new ArrayList<>(Arrays.asList("p","q","r","s"));
        List<String> num8 = new ArrayList<>(Arrays.asList("t","u","v"));
        List<String> num9 = new ArrayList<>(Arrays.asList("w","x","y","z"));

        List<List<String>> combinations = new ArrayList<>();
        String[] eachDigits = digits.split("");

        for(String digit: eachDigits ){
            if(digit.equals("2"))
                combinations.add(num2);
            else if(digit.equals("3"))
                combinations.add(num3);
            else if(digit.equals("4"))
                combinations.add(num4);
            else if(digit.equals("5"))
                combinations.add(num5);
            else if(digit.equals("6"))
                combinations.add(num6);
            else if(digit.equals("7"))
                combinations.add(num7);
            else if(digit.equals("8"))
                combinations.add(num8);
            else if(digit.equals("9"))
                combinations.add(num9);
        }

        List<String> comb1 = new ArrayList<>();
        List<String> comb2 = new ArrayList<>();

        int numberOfCombinations = 1;
        for(List<String> combination :combinations )
            numberOfCombinations *= combination.size();
        
       int stop = 0;
       int count = 0;
       HashSet<String> combiner = new HashSet<>();

       while(stop <= combinations.size()){
            int n = 0;
            for(List<String> comb: combinations){
                if(n ==2)
                    break;
                else if(n == 0)
                    comb1 = comb;
                else
                    comb2 = comb;
                n++;
            }
            combiner.clear();

            while(count != (numberOfCombinations) ){
                for(String letter1: comb1){
                    if(comb2.isEmpty())
                        combiner.add(letter1);
                    for(String letter2: comb2)
                        combiner.add(letter1 + letter2);
                }
                count++;
            }

            count = 0;
            combinations.remove(comb1);
            combinations.remove(comb2);
            ArrayList<String> combinerList = (ArrayList<String>)combiner.stream().collect(Collectors.toList());
            if(!combinations.isEmpty())
                combinations.add(0,combinerList);

         stop++;
        }

        for(String out: combiner)
            output.add(out);
    
     return output;   
    }
}