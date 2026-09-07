import java.util.*;

public class continue_Question {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            
            do{
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if(n%10 == 0){
                continue;
            }
            System.out.println(n);
        }while(true);

        }

        
        
    }
    
}
