class Solution {
    public int lengthOfLongestSubstring(String s) {
       int right=0;int left=0; int l=0;
       HashSet<Character> set= new HashSet<>();
       while(right<s.length()){
        char c=s.charAt(right);
        if(!set.contains(c)){
            set.add(c);
            l=Math.max(l,right-left+1);
            right++;
        }else{
            set.remove(s.charAt(left));
            left++;
        }
       }
       return l;
        
    }
}