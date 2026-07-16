class Solution {
    public int lengthOfLongestSubstring(String s) {
        // if(s.length() == 0){
        //     return 0;
        // }
        
        List<Character> res = new ArrayList<>();
        int max = 0, curr = 0;
        while(curr < s.length()){
            Character c = s.charAt(curr);
            if(!res.contains(s.charAt(curr))){
                res.add(c);
                curr++;
                
            }
            else{
                res.remove(0);
                // res.add(c);
            };
            // curr++;
            max = Math.max(max, res.size());
        }
        return max;
        
    }
}
