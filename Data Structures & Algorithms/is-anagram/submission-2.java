class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        if (Arrays.equals(sArray, tArray) ){
            return true;
        }
        return false;
    }

    // public Map<Character, Integer> getAnagram(String s){
    //     Map<Character, Integer> anagram = new HashMap<>();

    //     char[] chars = s.toCharArray();
    //     Arrays.sort(chars);
    //     for(Character c: chars){
    //         if(anagram.containsKey(c)){
    //             anagram.put(c, anagram.get(c)+1);
    //         }else{
    //             anagram.put(c, 1);
    //         }
    //     }

    //     return anagram;
    // }
}
