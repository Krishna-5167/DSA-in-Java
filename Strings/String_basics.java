import java.util.*;


public class String_basics {
     public static void printLetter(String str){
        for(int i=0 ; i< str.length() ; i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){

        // char arr[] = {'a' , 'b' , 'c' , 'd' , 'e' };
        // String str = "abcd";
        // String str2 = new String("xyz");

        //Strings are immutable means it cannot be change

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);


        // String fullName = "Tony Stark";
        // System.out.println(fullName.length());


        String firstName = "Krishna";
        String lastName = "Goyal";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        System.out.println(fullName.charAt(0));

        printLetter(fullName);


        sc.close();


    }
    
}
