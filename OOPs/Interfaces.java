interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right , diagonal - (all in 4 dirn)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right ");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up , down , left , right , diagonal - (in 1 step)");
    }
}


public class Interfaces {

    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
    
}
