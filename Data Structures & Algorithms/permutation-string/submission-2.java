class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()){
            return false;
        }

        int l = 0, r = s1.length();
        while(l < s2.length()-s1.length()+1){
            
            String subString = s2.substring(l, r);
            System.out.println(subString);
            if(getAnagram(s1).equals(getAnagram(subString))){
                return true;
            }
            l++;
            r++;
        }
        return false;
    

    }

    public Map<Character, Integer> getAnagram(String str){
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        return map;
    }
}
