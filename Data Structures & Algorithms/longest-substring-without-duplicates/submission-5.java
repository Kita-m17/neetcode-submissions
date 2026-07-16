class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> res = new ArrayList<>();
        int max = 0, curr = 0;
        while(curr < s.length()){
            if(!res.contains(s.charAt(curr))){
                res.add(s.charAt(curr));
                curr++;
            }
            else{
                res.remove(0);
            };
            max = Math.max(max, res.size());
        }
        return max;
        
    }
}
