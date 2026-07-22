

import java.util.*;
public class JosephusProblem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int ans=solve(n, m);
        System.out.print(ans);
        sc.close();
    }
    public static int solve(int n, int m){
        class Node{
            int data;
            Node next;

            Node(int val){
                this.data=val;
            }
        }
        Node head=new Node(1);
        Node temp=head;
        for(int i=2;i<=n;i++){
            temp.next=new Node(i);
            temp=temp.next;
        }
        temp.next=head;
        Node curr=head;
        int count=1;
        Node prev=temp;
        while(curr.next!=curr){
            if(count==m){
                prev.next=curr.next;
                curr=curr.next;
                count=1;
            }else{
                prev=curr;
                curr=curr.next;
                count++;
            }
        }
        return curr.data;
    }
}