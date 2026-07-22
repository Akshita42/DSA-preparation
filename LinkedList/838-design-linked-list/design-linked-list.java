class MyLinkedList {
    class Node{
        int data;
        Node next;

        Node(int val){
            this.data=val;this.next=null;
        }
    }
    Node head;
    int size;

    public MyLinkedList() {
        head=null;
        size=0;
    }
    
    public int get(int index) {
        int count=0;
        Node curr=head;
        if(index<0 || index>=size)
            return -1;
        while(curr!=null){
            if(count==index){
                return curr.data;
            }
            count++;
            curr=curr.next;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node nn= new Node(val);
        nn.next=head;
        head=nn;
        size++; 
    }
    
    public void addAtTail(int val) {
        Node nn=new Node(val);
        if(head==null){
            head=nn;
        }else{
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=nn;
        }
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        Node nn=new Node(val);
        int count=0;
        if(index<0|| index>size){
            return;
        }
        if(index==size){
            addAtTail(val);
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        Node curr=head;
        while(curr!=null){
            if(count==index-1){
                nn.next=curr.next;
                curr.next=nn;
                size++;
                return;
            }
            curr=curr.next;
            count++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index<0||index>=size){
            return;
        }
        if(index==0){
            head=head.next;
            size--;
            return;
        }
        Node curr=head;
        int count=0;
        while(curr.next!=null){
            if(count==index-1){
                curr.next=curr.next.next;
                size--;
                return;
            }
            curr=curr.next;
            count++;
        }
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */