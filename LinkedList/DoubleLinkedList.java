import java.util.*;
class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data=data;
        prev=null;
        next=null;
    }
}
public class DoubleLinkedList{
    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    private static Node convertArr2DL(int[] arr){
        Node head= new Node(arr[0]);
        Node prev=head;
        for (int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            prev.next=temp;
            temp.prev=prev;
            prev=temp;
        }
        return head;

    }
    private static Node deleteKthNode(Node head, int k){
        if(head==null) return null;

        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            if(count==k){
                break;
            }
            temp=temp.next;
        }
        Node back=temp.prev;
        Node front=temp.next;
        if(back==null && front==null){
            return null;
        }else if(back==null){
            deleteHead(temp);
        }else if(front==null){
            deleteTail(temp);
        }else{
            back.next=front;
            front.prev=back;

            temp.next=null;
            temp.prev=null;
        }
        return head;


    }
    private static Node deleteTail(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        Node tail=temp.next;
        temp.next=null;
        tail.prev=null;

        return head;
    }
    private static Node deleteHead(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node prev=head;
        head=head.next;
        head.prev=null;
        prev.next=null;

        return head;
    }
    public static void main(String[] args){
        int[] arr={12, 5, 6, 8};
        Node head=convertArr2DL(arr);
        head=deleteHead(head);
        head=deleteTail(head);
        head=deleteKthNode(head,3);
        print(head);
        
    }
}