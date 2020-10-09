package code.practice.algo.algopractice.cci.arraysandstrings;

import java.util.HashMap;

public class StringPermutataionCheck {


    public static void main(String args[]){

        String alpha = "abb";
        String bravo = "bac";

        StringPermutataionCheck StringPermutataionCheck = new StringPermutataionCheck();
        StringPermutataionCheck.solutionOne(alpha, bravo);
        StringPermutataionCheck.solutionTwo(alpha, bravo);

    }


    private void solutionTwo(String alpha, String bravo){

        HashMap<Character,Integer> hmap = new HashMap<>();
        int count=0;
        for(int i=0; i<alpha.length(); i++){
            if(hmap.containsKey(alpha.charAt(i))){
                hmap.put(alpha.charAt(i), count++);
            }
            hmap.put(alpha.charAt(i),count++);
        }

    }




    public void solutionOne(String alpha, String bravo){

        // String sortedAlpha = sortString(alpha);
        // String sortedBravo = sortString(bravo);


    }

    /*private String sortString(String string){

        //dzabxd

        for(int i=0; i<string.length(); i++){
            for(int j =1+i;j<string.length();j++){
                if(string.charAt(i) > string.charAt(j)){
                    char temp = string.charAt(i);
                    string.charAt(i) = string.charAt(j);


                }
            }

        }

    }*/
}
