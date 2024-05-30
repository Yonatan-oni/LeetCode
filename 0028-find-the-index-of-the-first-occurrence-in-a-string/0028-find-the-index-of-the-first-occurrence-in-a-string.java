class Solution {
    public int strStr(String haystack, String needle) {
        int output = -1;
        List<Integer> needleList = new ArrayList<>();

        for(int i = 0; i < haystack.length(); i++){
            if(haystack.length() < needle.length()){
                output = -1;
                break;
            }
            else if(haystack.charAt(i) == needle.charAt(0)){
                int k = i;
                if(needle.length() < (haystack.length() - i +1)){
                    for(int j = 0; j < needle.length(); j++){
                        if( haystack.charAt(k) == needle.charAt(j) ){
                            needleList.add(1); 
                        }else{
                            needleList.add(-1); 
                        }
                        k++;
                     }
                }

                while(needleList.contains(1)){
                    needleList.remove(Integer.valueOf(1));
                }

                if(needleList.isEmpty() && (needle.length() < (haystack.length() - i +1))){
                    output = i;
                    break;
                }else{
                    output = -1;
                    needleList.removeAll(needleList);
                }
            }
        }

        return output;
        
    }
}