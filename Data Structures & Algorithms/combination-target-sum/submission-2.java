class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        result = new ArrayList<>();
        Arrays.sort(nums);
        dfs(0, new ArrayList<>(), 0, nums, target);
        return result;
    }

    private void dfs(int i, List<Integer> current, int total, int[] nums, int target){
        if (total == target){
            //we have our combo
            result.add(new ArrayList<>(current));
            return;
        }

        for(int j = i; j<nums.length; j++){
            if(total + nums[i] > target){
                return; //not the result we want
            }
            current.add(nums[j]); //add the current number to the list if its still <= target
            dfs(j, current, total+nums[j], nums, target); //get more combinations
            current.remove(current.size()-1);
        }
    }
}
