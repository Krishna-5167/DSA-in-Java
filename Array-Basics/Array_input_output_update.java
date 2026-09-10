import java.util.*;

public class Array_input_output_update {
    public static void main(String args[]){
        
        //create
        int marks[] = new int[50];

        //input
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        //output
        System.out.println("phy : "+ marks[0]);
        System.out.println("math : "+ marks[1]);
        System.out.println("chem : "+ marks[2]);

        // update
        marks[2] = 100;  
        System.out.println("chem : "+ marks[2]);

        // array length
        System.out.println("Length of an array : "+ marks.length);

        sc.close();
    }
}
