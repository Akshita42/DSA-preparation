class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left=0; long sum=0; int max_freq=0;
        for (int i=0;i<nums.length;i++){
            sum+=nums[i];
            while((long)nums[i]*(i-left+1)-sum>k){
                sum-=nums[left];
                left++;
            }
            max_freq=Math.max(max_freq, i-left+1);
        }
        return max_freq;
    }
}