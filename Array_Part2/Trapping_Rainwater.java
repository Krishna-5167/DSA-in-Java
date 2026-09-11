public class Trapping_Rainwater {
    public static int trappedRainwater(int height[] ){
        int n = height.length;

        // left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1] , height[i]);
        }

        // Right max Boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i= n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        int trappedwater = 0;
        //loop
        for(int i=0 ; i<n ;i++){
            //waterLevel
            int waterLevel = Math.min(leftMax[i] , rightMax[i]);

            //trappedWater
            trappedwater += waterLevel - height[i];
        }
        return trappedwater;

       

    }

    public static void main(String args[]){
        int height[] = {4 , 2, 0 , 6 , 3, 2 , 5};
        System.out.println(trappedRainwater(height));
        
        
        
    }
    
}
