class Solution {
    public int findMin(int[] nums) {
        Arrays.parallelSort(nums);

        
        return nums[0];
    }
}
