package code.practice.algo.algopractice.common.LinkedList;

public class ImplementLinkedList {

    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    public static void main(String args[]) {

        ImplementLinkedList lList = new ImplementLinkedList();
        lList.head= new Node(10);
        Node second = new Node(20);
        Node third = new Node(40);

        lList.head.next= second;
        second.next = third;

    }

    public void insert(){

        if(head == null){
            lList.head = head;
        }

    }


}
