class Solution {
    public boolean isValid(String s) {
        List<Character> valid = new ArrayList<>();
        String opening = "{([";
        for(int i = 0; i<s.length(); i++){
            if(opening.indexOf(s.charAt(i)) != -1){
                valid.add(s.charAt(i));
            }else {
                if( !valid.isEmpty()  && getClosing(valid.get(valid.size() - 1)) == s.charAt(i) ){
                    valid.remove(valid.size() - 1);
                }else{
                    return false;
                }
            }
        }

        return valid.isEmpty();
    }

    public Character getClosing(char opening){
        if(opening == '['){
            return ']';
        }else if(opening == '{'){
            return '}';
        }else{
            return ')';
        }
    }
}