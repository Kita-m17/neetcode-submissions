class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }

        int max = 1, curr = 1;
        int[] dp = new int[nums.length];
        Arrays.sort(nums);
        Arrays.fill(dp, 1);

        for(int i = nums.length-1; i>=0; i--){
            for(int j = i+1; j<nums.length; j++){
                if(nums[j] == nums[i]+1){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
