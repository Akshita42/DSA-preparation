class Solution {
    public int largestAltitude(int[] gain) {
        int max_sum=0; int sum=0;
        for (int i=0;i<gain.length;i++){
            sum+=gain[i];
            max_sum=Math.max(max_sum, sum);       }
        return max_sum;                                                                     }
}