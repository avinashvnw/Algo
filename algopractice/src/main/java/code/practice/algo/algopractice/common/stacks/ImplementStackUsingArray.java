package code.practice.algo.algopractice.common.stacks;

import java.util.ArrayList;
import java.util.List;

public class ImplementStackUsingArray {

    public static void main(String args[]) {

        int rootPos = 0;
        ImplementStackUsingArray implementStackUsingArray = new ImplementStackUsingArray();
        List<Integer> StackList = new ArrayList<>();
        System.out.println(" Stack using list created ");
        boolean result = implementStackUsingArray.isEmpty(rootPos);
        System.out.println(" checking if stack is empty " + StackList.isEmpty());

    }

    public boolean isEmpty(int rootPos) {
        return (rootPos < 0);
    }

    public void push(int data) {

    }

    public void pop() {

    }

    public void peek() {

    }

    public void search() {

    }

}
