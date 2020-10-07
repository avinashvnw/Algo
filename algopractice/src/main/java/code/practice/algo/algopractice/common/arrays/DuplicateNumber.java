package code.practice.algo.algopractice.common.arrays;

public class DuplicateNumber {

    public static void main(String args[]){

        solutionOne();


    }

    private static void solutionOne() {
        int[] numArr = new int[]{4,7,6,7,9};
        for(int i=0;i<numArr.length; i++){
           for(int j =1+i; j<numArr.length;j++){
               if(numArr[i] == numArr[j]){
                   System.out.println(" repating is "+numArr[i]);
               }
           }

        }
    }
}
