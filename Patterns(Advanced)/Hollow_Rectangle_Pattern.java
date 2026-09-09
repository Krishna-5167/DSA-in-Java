public class Hollow_Rectangle_Pattern {
    public static void hollow_Rectangle(int tolRows , int tolCols){
        for(int i =1; i <= tolRows ; i++){
            for(int j = 1; j<= tolCols ; j++){
                if(i == 1 || i== tolRows || j== 1 || j == tolCols ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        hollow_Rectangle(4, 5);
    }
    
}
