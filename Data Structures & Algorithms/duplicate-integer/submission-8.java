class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        if (nums.length != 0){
            int val = nums[0];
            for(int i = 1; i< nums.length; i++){
                if(val == nums[i]){
                    return true;
                }
                val = nums[i];
            }
        }
            
        return false;
        // HashSet<Integer> nums2 = new HashSet<>();

        // for(int i = 0; i<nums.length; i++){
        //     if(nums2.contains(nums[i])){
        //         return true;
        //     }
        //     nums2.add(nums[i]);
        // }
        // return false;
        
    }
}

