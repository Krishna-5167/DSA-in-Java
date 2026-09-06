import java.util.Scanner;

public class Student_Pass_Fail {

    public static void main(String args[]){
               Scanner sc = new Scanner(System.in);
               int marks = sc.nextInt();

               //ternary operator
               String Result = (marks >=33)?"PASS":"Fail";
               System.out.println(Result);
               
               sc.close();
        }

    
}
