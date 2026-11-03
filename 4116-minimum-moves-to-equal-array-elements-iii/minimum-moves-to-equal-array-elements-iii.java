class Solution {
    public int minMoves(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        int target=nums[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            while(nums[i]!=target){
                nums[i]=nums[i]+1;
                count++;
            }
        }
        return count;
    }
}