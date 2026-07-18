class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length-1;
        return recurse(nums, target, l, r);
    }

    public int recurse(int[] nums, int target, int l, int r){
        if(l>r){
            return -1;
        }

        int mid = l+(r-l)/2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] < target){
            return recurse(nums, target, mid+1, r);
        }else{
            return recurse(nums, target, l, mid-1);
        }
    }
}
