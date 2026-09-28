public class Print_digits_into_words {

    static String digits[] = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine" , "ten"};

    public static void printDigits(int number){
        if(number == 0){
            return;
        }

        int lastDigit = number % 10;
        printDigits(number/10);
        System.out.print(digits[lastDigit] + " ");
    }

    
    

    public static void main(String args[]){
        printDigits(898);
        System.out.println();
       
        
    }
}

