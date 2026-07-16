class Solution {
    public int characterReplacement(String s, int k) {
        // List<Character> res = new ArrayList<>();
        Map<Character, Integer> map =  new HashMap<>();
        int max = 0;
        int l = 0;
        int result = 0;
        
        for(int r = 0; r < s.length(); r++){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            int winSize = r-l+1;
            
            max = Math.max(max, Collections.max(map.values()));

            int replacements = winSize - max;
            if(replacements > k){
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }

            winSize = r-l+1;
            result = Math.max(result, winSize);

        }

        return result;
    }
}
