class Solution {
    public int countCommas(int n) {
        int count=0;
        for (int i=1;i<=n;i++){
            String num=String.valueOf(i);
            if(num.length()>3){
                count+=(num.length()-1)/3;
            }
        }
        return count;
    }
}