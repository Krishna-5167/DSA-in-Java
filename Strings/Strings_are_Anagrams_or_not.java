import java.util.*;

public class Strings_are_Anagrams_or_not {
    public static void main(String args[]){
        String str1 = "earth" ;
        String str2 = "heart";

        //convert Strings to lowercase why? so that we dont have to check seperately for lower and upperCase
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        //first check if the lengths are same

        if(str1.length() == str2.length()){

            //convert Strings into char array

            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            //sort the char Array

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            //if the sorted char arrays are same or identical then the strings are anagrams

            boolean result = Arrays.equals(str1charArray, str2charArray);

            if(result){
                System.out.println(str1 + " and " + str2 + " are anagrams" );
            }else{
                System.out.println(str1 + " and " + str2 + " are not anagrams");
            }
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
        
    }
}
