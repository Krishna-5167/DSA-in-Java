public class Check_if_Odd_or_Even {
    public static void printOddEven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            //even
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    public static void main(String args[]) {
        printOddEven(3);
        printOddEven(4);
        
    }
    
}
