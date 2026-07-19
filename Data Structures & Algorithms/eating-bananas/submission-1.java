class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // Arrays.sort(piles);
        // Arrays.
        int max = Arrays.stream(piles).max().getAsInt();

        int l = 0, r = max, res = r;
        while(l<=r){
            int mid = l + (r-l)/2;
            int hours = 0;
            for(int i = 0; i<piles.length;i++){
                hours+=Math.ceil((double)piles[i]/mid);
                if(hours > h){
                    break;
                }
            }

            if(hours <= h){
                r = mid-1;
                res = mid;
            }else{
                l = mid+1;
            }
        }
        return res;

    }
}
