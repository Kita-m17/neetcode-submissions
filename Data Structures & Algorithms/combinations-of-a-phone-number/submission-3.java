class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.equals(""))
            return new ArrayList<>();

        String[] numToChars = {"", "", "abc", "def", "ghi", "jkl", "mno", "qprs", "tuv", "wxyz"};
        
        List<String> res = new ArrayList<>();
        res.add("");
        for(char digit: digits.toCharArray()){
            List<String> temp = new ArrayList<>();
            for(String currentString: res){
                for(char c: numToChars[digit - '0'].toCharArray()){
                    temp.add(currentString + c);
                }
            }
            res = temp;
        }
        return res;
    }
}
