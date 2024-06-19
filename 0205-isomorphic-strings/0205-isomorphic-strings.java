class Solution {
    public boolean isIsomorphic(String s, String t) {
        return Arrays.equals(checker(s),checker(t));
    }
    
    private String[] checker(String word) {
        String[] letter = word.split("");
        int n = letter.length;
        int[] charToNumber = new int[256];
        Arrays.fill(charToNumber, -1);
        int number = 1;

        for (int i = 0; i < n; i++) {
            if (charToNumber[letter[i].charAt(0)] == -1) {
                charToNumber[letter[i].charAt(0)] = number++;
            }
            letter[i] = String.valueOf(charToNumber[letter[i].charAt(0)]);
        }

        return letter;
    }


}