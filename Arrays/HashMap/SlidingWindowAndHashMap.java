package Arrays.HashMap;

import java.util.*;

//Count of Substring without repeating Characters
public class SlidingWindowAndHashMap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashSet<Character> set=new HashSet<>();
        int left=0; int count=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            count+=right-left+1;

        }
        System.out.print(count);
        sc.close();
    }
    
}
