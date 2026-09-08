import java.util.*;

public class Parameters_Arguments {
    public static int calculateSum(int a , int b){  // parameters or formal parameters
        
        int sum = a+b;
        return sum;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a , b);  // arguments or actual parameter
        System.out.println("Sum is: "+sum);

        sc.close();

    } 
}
