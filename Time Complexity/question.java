public class question {

    public static void main(String args[]){
        int n =5;
        
        for(int i=0; i<n; i++){
            for(int j=0; j>i ; --j){
                int a =  i+j;
                System.out.println(a);
            }
             
        }
       
    }
    
}

//time complexity = O(n^2)
//space Complexity = O(1)
