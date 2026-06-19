class Solution {
    public int largestAltitude(int[] gain) {
        int[] altitude=new int[gain.length+1];
        altitude[0]=0;
        int sum=0;
        for (int i=1;i<=gain.length;i++){
            sum+=gain[i-1];
            altitude[i]=sum;
        }
        int largest=Integer.MIN_VALUE;
        for (int i=0;i<altitude.length;i++){
            if(altitude[i]>largest){
                largest=altitude[i];
            }
        }
        return largest;
        
    }
}