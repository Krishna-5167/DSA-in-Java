public class Count_Substrings_ending_with_same_character {

    public static int countSubstr(String str , int i , int j , int n){
        
        //base case
        if(n==0 || n==1){
            return n;
        }

        int res = countSubstr(str , i+1 , j , n-1) + countSubstr(str , i , j-1 , n-1) - countSubstr(str , i+1 , j-1 , n-1);

        if(str.charAt(i) == str.charAt(j)){
            res++;
        }
        return res;
    }

    public static void main(String args[]){
        String str = "abcab";
        int n = str.length();
        countSubstr(str, 0, n-1, n);

    }
    
}
