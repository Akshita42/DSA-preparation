class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=Integer.MIN_VALUE; int high=0;
        for (int i: weights){
            low=Math.max(low, i);
            high+=i;
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(canShip(weights,days,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    private static boolean canShip(int[] arr, int days, int limit){
        int k=1;
        int load=0;
        for (int weight: arr){
            if((load+weight)<=limit){
                load+=weight;
                
            }else{
                k++;
                load=weight;
                if(k>days){
                    return false;
                }
            }
        }
        return true;
    }
}