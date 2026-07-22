package Recurssion;
import java.util.*;
public class Sumofdigits {
    public static void digit_sum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        if(sum<10){
            System.out.println("Recursive call"+" "+sum);
            return;
        }
        System.out.println("preorder"+" "+sum);
       digit_sum(sum);
       System.out.println("postorder"+" "+sum);
    } 
   public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    digit_sum(n);
    // int result=digit_sum(n);
    // System.out.print(result);
    sc.close();
   } 
}
