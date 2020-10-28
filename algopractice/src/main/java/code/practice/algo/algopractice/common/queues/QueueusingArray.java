package code.practice.algo.algopractice.common.queues;

public class QueueusingArray {

    int max = 3;
    int[] queueArray = new int[max];
    int front = -1;
    int rear = -1;

    public static void main(String args[]) {

        QueueusingArray queueusingArray = new QueueusingArray();
        queueusingArray.isEmpty();
        queueusingArray.isFull();
        queueusingArray.enqueue(10);
        queueusingArray.isFull();
        queueusingArray.isEmpty();
        queueusingArray.enqueue(20);
        queueusingArray.enqueue(30);
        queueusingArray.isFull();
        queueusingArray.isEmpty();
        queueusingArray.peek();
        queueusingArray.dequeue();
        queueusingArray.peek();
        queueusingArray.dequeue();
        queueusingArray.peek();
        queueusingArray.dequeue();
        queueusingArray.peek();
        queueusingArray.dequeue();
        queueusingArray.dequeue();
        queueusingArray.peek();
    }


    //isFull
    public boolean isFull() {
        boolean isFull = false;
        if (rear == queueArray.length - 1) {
            isFull = true;
        }
        System.out.println("is the Queue Full : " + isFull);
        return isFull;
    }

    //isempty
    public boolean isEmpty() {
        boolean isEmpty = false;
        if (rear == -1 || front == -1) {
            isEmpty = true;
        }
        if (front > rear) {
            isEmpty = true;
        }
        System.out.println("is the Queue Empty : " + isEmpty);
        return isEmpty;
    }

    //enqueue
    public void enqueue(int key) {
        if (rear == -1 || front == -1) {
            rear = rear + 1;
            front = front + 1;
            queueArray[rear] = key;
            System.out.println(+key + " successfully enqueued in queue at position " + rear);
        } else {
            rear++;
            queueArray[rear] = key;
            System.out.println(+key + " successfully enqueued in queue at position " + rear);
        }
    }

    //dequeue
    public void dequeue() {
        if (front <= rear) {
            if (front == -1 && rear == -1) {
                System.out.println("Stack is empty to perform dequeue");
            } else if (front == 0 && rear == 0) {
                front = -1;
                rear = -1;
                System.out.println("element dequed from queue");
            } else {
                front = front + 1;
                System.out.println("element dequed from queue");
            }
        }
    }

    //peek
    public void peek() {
        if (!isEmpty()) {
            System.out.println("the peek element is :" + queueArray[front]);
        }
    }

}
