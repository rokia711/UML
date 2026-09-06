package LinkedList;

public class sLinkedList {
    Node head;
    public void add(int data){
        Node newNode= new Node(data);
        if (head==null){
            head=newNode;
            return;
        }Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }temp.next=newNode;
        newNode=null;
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void update(int index,int newData){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }temp.data=newData;
    }
    public void delete(int index){
        if(index==0){
            head=head.next;
        }Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }temp.next=temp.next.next;
    }


}
