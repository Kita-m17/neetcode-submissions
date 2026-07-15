class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] indices = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(numbers);

        for(int i = 0; i<numbers.length-1; i++){
            int diff = target-numbers[i];

            for(int j = i+1; j<numbers.length; j++){
                if(numbers[j] == diff){
                    indices[0] = i+1;
                    indices[1] = j+1;
                }
            }
        }
        // Arrays.sort(indices);
        return indices;

    }
}
