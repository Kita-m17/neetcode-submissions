class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int count = 0;
        List<Integer> vals = new ArrayList<>();

        for(int i = 0; i<nums.length; i++){
            vals.add(nums[i]);
            if(vals.size() == k){
                res[i-k+1] = Collections.max(vals);
                vals.remove(0);

            }

        }
        return res;
    }
}
