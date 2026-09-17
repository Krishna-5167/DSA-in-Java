public class Clear_last_i_bits{
    public static int clearIBit(int n , int i){
        int bitmask = ((-1)<<i);
        return n & bitmask;
    }

    public static void main(String args[]) {
        System.out.println(clearIBit(15 , 2));
        
    }
}