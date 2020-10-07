package code.practice.algo.algopractice.common.arrays;

public class LargeAndSmallNum {

    public static void main(String[] args) {

        solutionOne();
    }

    private static void solutionOne() {
        int numArr[] = new int[]{5, 6, 1, 0, 4};
        int small = numArr[0];
        int large = numArr[numArr.length-1];

        for (int i = 0; i < numArr.length - 1; i++) {
            for(int j=0; j<numArr.length-1;j++){

                if((numArr[i]<numArr[j]) && (numArr[i]<small)){
                    small = numArr[i];
                }
                if((numArr[i]>=numArr[j]) && (numArr[j]>large)){
                    large = numArr[j];
                }
            }

        }
        System.out.println(" the smallest is : "+small+" and largest is : "+large);
    }
}
