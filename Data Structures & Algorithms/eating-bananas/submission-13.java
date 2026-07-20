class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Arrays.sort(piles);
        int l = 1, r = Arrays.stream(piles).max().getAsInt(), res = r;
        while(l<=r){
            int mid = l + (r-l)/2;
            int hours = 0;
            for(int i = 0; i<piles.length;i++){
                hours+=Math.ceil((double)piles[i]/mid);
            }

            if(hours <= h){
                res = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return res;

    }
}
