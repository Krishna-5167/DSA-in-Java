public class UpperCase_to_LowerCase_using_bits {
    public static void main(String args[]) {
        
        //convert uppercase character to lowercase

        for(char ch='A'; ch<= 'Z'; ch++){
            System.out.print((char)(ch | ' '));
        }
    }
}
