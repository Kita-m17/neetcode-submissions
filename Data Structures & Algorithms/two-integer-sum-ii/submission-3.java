class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<numbers.length; i++){
            int diff = target-numbers[i];

            for(int j = 1; j<numbers.length && i!=j; j++){
                if(numbers[j] == diff){
                    indices[0] = i+1;
                    indices[1] = j+1;
                }
            }
        }
        Arrays.sort(indices);
        return indices;

    }
}
