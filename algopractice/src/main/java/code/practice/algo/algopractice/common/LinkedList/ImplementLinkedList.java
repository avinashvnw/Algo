package code.practice.algo.algopractice.common.LinkedList;

public class ImplementLinkedList {

    Node head;
    Node tail;

/*
    1. create a linked list i.e nodes
    2. add data and connect nodes
    3. insert new node at the tail
    4. update data in a middle node
    5. delete the head node
    6. traverse through nodes and find number 55 is available in any of the node

 */

    public static void main(String args[]) {
        ImplementLinkedList llist = new ImplementLinkedList();

        //create Nodes
        llist.head = new Node(2);
        Node alpha = new Node(5);
        Node bravo = new Node(1);
        Node charlie = new Node(-1);
        Node delta = new Node(999);

        //linking Nodes

        llist.head.next= alpha;
        alpha.next= bravo;
        bravo.next = charlie;
        charlie.next  = delta;
        llist.tail = delta;

        //print nodes
        printNodes(llist);


        //inserting new node and adding to tail

        Node extraNode = new Node(-5);
        Node extraNode1 = new Node(100);
        llist.tail.next = extraNode;
        llist.tail= extraNode;

        llist.tail.next = extraNode1;
        llist.tail = extraNode1;


        System.out.println(" head node is : "+llist.head.data);
        System.out.println(" tail node is : "+llist.tail.data);

        //inserting nodes and adding to head

        Node zulu = new Node(25);
        llist.head.prev = zulu;
        llist.head= zulu;
        System.out.println(" new nodes are: ");
        printNodes(llist);


        // updating data

        updateNode(llist.tail, 10);






    }

    static class Node {

        int data;
        Node next;
        Node prev;

        Node(int d) {
            data = d;
        }

    }

    public static void updateNode(Node pos, int data){

        pos.data = data;
    }


    public static void printNodes(ImplementLinkedList llist){

        Node currNode = llist.head;

        if(currNode == null){
            System.out.println("No Nodes were available in linked list");
        }
        else{
            while(currNode != null){
                System.out.print(" -> "+currNode.data);
                currNode = currNode.next;
            }
        }

    }
}
