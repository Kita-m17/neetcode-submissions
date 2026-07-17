public class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) return "";

        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char c : t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }

        int have  = 0, need = countT.size();
        int[] res = {-1, -1};
        int resLen = Integer.MAX_VALUE;

        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            window.put(s.charAt(r), window.getOrDefault(s.charAt(r), 0) + 1);

            if(countT.containsKey(s.charAt(r)) &&  window.get(s.charAt(r)) == countT.get(s.charAt(r))){
                have++;
            }

            while(have == need){
                if((r-l+1)<resLen){
                    resLen = r-l+1;
                    res[0] = l;
                    res[1] = r;
                }

                window.put(s.charAt(l), window.get(s.charAt(l)) - 1);
                if(countT.containsKey(s.charAt(l)) &&  window.get(s.charAt(l)) < countT.get(s.charAt(l))){
                    have--;
                }
                l++;
            }
            // Map<Character, Integer> countS = new HashMap<>();
            // for (int j = i; j < s.length(); j++) {
            //     countS.put(s.charAt(j), countS.getOrDefault(s.charAt(j), 0) + 1);

            //     boolean flag = true;
            //     for (char c : countT.keySet()) {
            //         if (countS.getOrDefault(c, 0) < countT.get(c)) {
            //             flag = false;
            //             break;
            //         }
            //     }

            //     if (flag && (j - i + 1) < resLen) {
            //         resLen = j - i + 1;
            //         res[0] = i;
            //         res[1] = j;
            //     }
            // }
        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}