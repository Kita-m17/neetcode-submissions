class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] merged = new int[size];

        System.arraycopy(nums1, 0, merged, 0, nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);

        Arrays.sort(merged);
        if(size%2 == 0){
            return (double)(merged[size/2]+merged[size/2 - 1])/2;
        }else{
            return merged[size/2];
        }
    }
}
