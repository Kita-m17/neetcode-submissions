class Solution {

    public String encode(List<String> strs) {
        String res = "";
        if(strs.isEmpty()){
            return res;
        }
        strs.replaceAll(s -> s.equals("") ? "**,": s);

        for(String s: strs){
            res+= s + " - ";
        }

        return res;
    }

    public List<String> decode(String str) {
        String[] strs = str.split(" - ");
        if(str.equals("")){
            List<String> res = new ArrayList<>();
            return res;
        }
        List<String> res = new ArrayList<>(Arrays.asList(strs));
        res.replaceAll(s -> s.equals("**,") ? "": s);

        return res;
    }
}
