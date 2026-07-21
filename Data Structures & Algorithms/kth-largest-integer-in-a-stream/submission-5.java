class KthLargest {
    int[] nums;
    int k;
    PriorityQueue<Integer> largest;

    public KthLargest(int k, int[] nums) {
        this.largest = new PriorityQueue<>();
        int count = 1;
        this.k = k;
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
