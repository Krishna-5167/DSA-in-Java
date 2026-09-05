import java.util.Scanner;

public class Product {

     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float prod = a*b;
        System.out.println(prod);

        sc.close();
    }

    
}
