public class Max_Subarray_Sum_BruteForce {
    public static void maxSubarraysSum(int numbers[] ){

        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length ; i++){
            for(int j=i; j<numbers.length; j++){
                int currSum =0;
                for(int k=i ; k<=j ; k++){
                    currSum += numbers[k];
                    
                }
                
                System.out.println("Sum = "+ currSum);

                if(currSum>maxSum){
                    maxSum = currSum;
                }
                
            }
            System.out.println();
        }
        System.out.println("Maximum Sum : "+maxSum);
       

    }

    public static void main(String args[]){
        int numbers[] = {1, -2 , 6 , -1, 3};
        maxSubarraysSum(numbers);
        
        
    }
    
}
