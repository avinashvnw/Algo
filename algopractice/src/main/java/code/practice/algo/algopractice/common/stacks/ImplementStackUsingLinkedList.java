package code.practice.algo.algopractice.common.stacks;

public class ImplementStackUsingLinkedList {

    stackNode root;

    public static void main(String args[]) {

        System.out.println(" Stack operations ready to use ");
        ImplementStackUsingLinkedList implementStack = new ImplementStackUsingLinkedList();
//        implementStack.pop();
//        implementStack.push(10);
        implementStack.peek();
        System.out.println(" checking is the stack empty " + implementStack.isEmpty());
        implementStack.push(10);
        System.out.println(" checking is the stack empty " + implementStack.isEmpty());
        implementStack.push(20);
        implementStack.peek();
        implementStack.pop();
        implementStack.peek();
        implementStack.pop();
        implementStack.peek();
        System.out.println(" checking is the stack empty " + implementStack.isEmpty());
        implementStack.push(5);
        implementStack.push(0);
        implementStack.push(2);
        implementStack.push(7);
        implementStack.push(20);
        System.out.println(" checking if 50 is present " + implementStack.search(50));
        System.out.println(" checking if 2 is present  " + implementStack.search(2));

    }


    public boolean isEmpty() {
        if (root != null) {
            return false;
        } else {
            return true;
        }

    }

    public void push(int insertionData) {

        if (root == null) {
            new stackNode(insertionData);
        } else {
            stackNode oldRoot = root;
            root = new stackNode(insertionData);
            root.prev = oldRoot;
            System.out.println(" the new root element is " + root.data);
        }
    }

    public int pop() {

        int popped = Integer.MIN_VALUE;
        if (root != null) {
            popped = root.data;
            root = root.prev;
        }
        return popped;
    }

    public int peek() {
        int result = Integer.MIN_VALUE;
        if (root != null) {
            System.out.println(" the peek element is " + root.data);
            result = root.data;
        }
        return result;
    }

    public boolean search(int searchElemnt) {

        boolean result = false;
        stackNode temproot = root;
        while (temproot != null) {
            if (temproot.data == searchElemnt) {
                result = true;
                break;
            }
            temproot = temproot.prev;

        }
        return result;
    }


    static class stackNode {

        int data;
        stackNode prev;

        stackNode(int d) {
            data = d;
            prev = null;
        }

    }


}
