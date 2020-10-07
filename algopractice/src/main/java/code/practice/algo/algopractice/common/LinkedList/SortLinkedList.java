package code.practice.algo.algopractice.common.LinkedList;


public class SortLinkedList {

    Node head;

    public static void main(String[] args) {

        SortLinkedList list = new SortLinkedList();
        list.head = new Node(10);
        Node second = new Node(5);
        Node third = new Node(15);
        Node fourth = new Node(1);
        Node fifth = new Node(7);

        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        //fifth.next = list.head;
        list.print();
        list.sortList();

        //adding new node in between
        Node Alpha = new Node(50);
        list.addElement(2, Alpha);

    }

    //5 10   50    15
    public void addElement(int index, Node Alpha){
        Node n = head;
        int count = 0;
        while(n != null){
            if(count == index){

            }
          count++;
        }
    }

    public void print() {
        Node n = head;
        while (n != null) {

            System.out.println(n.data + " ");
            n = n.next;
        }
    }

    //10, 5, 15, 5, 7
    public void sortList() {
        Node node1 = head;
        while (node1 != null) {
            Node node2 = head;
            while (node2 != null) {
                if ((node1.data > node2.data)) {
                    node2.next = node1;
                    node1.next = node2;
                }
                node2 = node2.next;
                System.out.println(" new data is : "+node2.data);
            }
            node1= node1.next;
           System.out.println(" new data is : "+node1.data);
        }
    }

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
        }
    }

}




