public class Find_Permutation {

    public static void findPermutations(String str , String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        //recursion -> O(n * n!)

        for(int i=0; i<str.length() ; i++){
            String curr = ans + str.charAt(i);
            // "abcde" = "ab"+"de" => "abde"
            String NewStr = str.substring(0, i) + str.substring(i+1);
            findPermutations(NewStr, curr);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        findPermutations(str, "");

    }
}
