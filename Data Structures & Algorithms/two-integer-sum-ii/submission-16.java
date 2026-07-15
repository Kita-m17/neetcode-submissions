class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<numbers.length; i++){
            int diff = target-numbers[i];
            if(map.containsKey(diff)){
                indices[0] = map.get(diff)+1;
                indices[1] = i+1;
            }
            map.put(numbers[i], i);
        }
        // Arrays.sort(indices);
        return indices;

    }
}
