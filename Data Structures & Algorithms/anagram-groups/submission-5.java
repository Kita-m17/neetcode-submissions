public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> samees = new HashMap<>();
        for(String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);

            String key = Arrays.toString(c);

            samees.putIfAbsent(key, new ArrayList<>());
            samees.get(key).add(s);
        }
        return new ArrayList<>(samees.values());






















        // Map<String, List<String>> res = new HashMap<>();
        // for (String s : strs) {
        //     int[] count = new int[26];
        //     s.chars().forEach(c -> count[c - 'a']++);
        //     // for (char c : s.toCharArray()) {
        //     //     count[c - 'a']++;
        //     // }
        //     String key = Arrays.toString(count);
        //     res.putIfAbsent(key, new ArrayList<>());
        //     res.get(key).add(s);
        // }
        // return new ArrayList<>(res.values());
    }
}