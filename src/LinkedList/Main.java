package LinkedList;

public class Main {
    public static void main(String[] args){
        sLinkedList list=new sLinkedList();
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(2);
        list.display();
        list.update(2,7);
        list.display();
        list.delete(1);
        list.display();
    }
}
