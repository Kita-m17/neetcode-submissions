class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int max = 1, curr = 1;
        Arrays.sort(nums);

        for(int i = 0; i<nums.length-1; i++){
            if(nums[i+1] == nums[i]+1){
                curr++;
            }else if(nums[i+1] == nums[i]){
                curr = curr;
            }else{
                curr = 1;
            }
            max = Math.max(curr, max);
        }
        return max;
    }
}
