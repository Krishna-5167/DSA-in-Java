public class BubbleSort_Optimized {

    public static void optimizedBubbleSort(int arr[]){
        for(int turn = 0 ; turn < arr.length-1; turn++){
            boolean swapped = false;
            for(int j=0 ; j<arr.length-1-turn ; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;

                }
            }
            if(swapped == false){
                break;
            }

        }
    }

    public static void main(String[] args) {
        int arr[] = {7 , 9 , 4, 6 , 2 , 3 , 5 , 11 , 1};
        optimizedBubbleSort(arr);
    }
    
}
