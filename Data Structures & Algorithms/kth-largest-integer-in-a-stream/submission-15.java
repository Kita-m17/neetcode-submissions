class KthLargest {
    int[] nums;
    int k;
    PriorityQueue<Integer> largest;

    public KthLargest(int k, int[] nums) {
        this.largest = new PriorityQueue<>();
        this.k = k;
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            this.largest.offer(nums[i]);
            
            if(largest.size() > k){
                this.largest.poll();
            }
        }
    }
    
    public int add(int val) {
        largest.offer(val);
        if( k < largest.size()){
            largest.poll();
        }
        return largest.peek();
    }
}
