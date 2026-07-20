class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1, res = nums[0];
        while(l<=r){
            // if sorted in increasing order - return left
            if(nums[l] < nums[r]){
                res = Math.min(res, nums[l]);
                break;
            }

            int mid = l + (r-l)/2;
            // res = Math.min(res, nums[mid]);

            if(nums[mid] >= nums[l]){
                l = mid + 1; //left part is sorted, min is in right half
            }else{
                r = mid - 1;
            }

            res = Math.min(res, nums[mid]);
        }
        
        return res;
    }
}
