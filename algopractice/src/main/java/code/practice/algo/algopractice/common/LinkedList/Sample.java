package code.practice.algo.algopractice.common.LinkedList;

public class Sample {
    public static int getPairsCount(int[] numList, int target) {
        int count = 0;
        for (int i = 0; i < numList.length; i++) {
            for (int j = i + 1; j < numList.length; j++) {
                if ((numList[i] + numList[j]) == target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {

        //method input list of integers, target

        int[] numlist = {5, 2, 3, 4, 6, 12};
        int target = 7;
        int count = getPairsCount(numlist, target);
        System.out.println(" pair count is " + count);


        //space = o(n)
        //time = o(n)^2
    }


    //target- intger
    // check reminder is available in the list


}
