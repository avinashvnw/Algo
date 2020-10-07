package code.practice.algo.algopractice.cci.arraysandstrings;

public class PalindiromeCheck {

    public static void main(String[] args) {
        PalindiromeCheck palindiromeCheck = new PalindiromeCheck();
        boolean result = palindiromeCheck.solutionOne("NITIN");
        System.out.println(" is it a palindrome: " + result);

    }


    public boolean solutionOne(String input) {

        /*
           Time complexity = log n
           Space Complexity = n
         */

        int condition;

        if (input.length() % 2 == 0) {
            condition = input.length() / 2;
        } else {
            condition = (input.length() / 2) + 1;
        }

        for (int i = 0; i < condition; i++) {

            if (input.charAt(i) != input.charAt((input.length() - 1) - i)) {
                return false;
            }
        }
        return true;

    }
}
