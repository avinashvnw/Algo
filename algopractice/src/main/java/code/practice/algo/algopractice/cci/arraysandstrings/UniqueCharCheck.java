package code.practice.algo.algopractice.cci.arraysandstrings;

public class UniqueCharCheck {

    public static void main(String args[]){

        /*
        implement an algorithm to check String has all unique characters
         */

        System.out.println("=====Application Started======");
        UniqueCharCheck uniqueCharCheck = new UniqueCharCheck();
        uniqueCharCheck.solutionOne("ttis");
        uniqueCharCheck.solutionTwo("tile");

    }

    public void solutionOne(String input){
        boolean isUnique = true;
        Character[] charAr = new Character[];
        for(int i=0; i<input.length(); i++){

            int charVal = input.charAt(i);
            if(charAr[charVal] != null){
                isUnique= false;
                break;
            }
            charAr[charVal] = input.charAt(i);
        }
        System.out.println(" is the String unique : "+isUnique);

    }

    public boolean solutionTwo(String input){

        boolean isUnique;
        Boolean charAr[] = new Boolean[256];
        if(input.length()>256)
            return false;
        for(int i=0; i<input.length(); i++ ){
            int value = input.charAt(i);
            if(charAr[value]){
               return false;
            }
            charAr[value] = true;
        }
        return true;
    }
}
