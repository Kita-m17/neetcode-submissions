class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> days = new Stack<>();
        int size = temperatures.length;
        int[] res = new int[size];

        for(int i = size -2; i>=0; i--){
            int j = i+1;
            while(j<size && temperatures[j] <= temperatures[i]){
                if(res[j]==0){
                    j = size;
                    break;
                }
                j+=res[j];
            }

            if(j<size){
                res[i] = j-i;
            }else{
                res[i] = 0;
            };
        }
        return res;
    }
}
