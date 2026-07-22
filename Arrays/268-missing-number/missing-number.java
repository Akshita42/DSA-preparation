class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long n_sum = n*(n+1)/2;
        long nums_sum=0;
        for(int num:nums){
            nums_sum+=num;
        }
        return (int)(n_sum-nums_sum);
    }
}