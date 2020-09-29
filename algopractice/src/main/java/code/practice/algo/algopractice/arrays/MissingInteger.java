package code.practice.algo.algopractice.arrays;

public class MissingInteger {

    /*
        How do you find the missing number in a given integer array of 1 to 100?
     */

 public static void main(String [] args)
 {
     boolean resultone = solutionOne();
 }

 public static boolean solutionOne(){

     /*
     numbers in sorted order
     no repeating numbers
     only one missing humber
      */

     int[] numArr = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,17,18,19,20};
     int missingCount = 0;
     boolean wereNumberMissing = false;

         for(int i=0; i<numArr.length; i++){

            if(!(numArr[i]+1 == numArr[i+1])){
                missingCount++;
            }

         }
         System.out.println(" total numbers missed are : "+missingCount);
     return wereNumberMissing;
 }


}