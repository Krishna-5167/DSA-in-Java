interface Herbivours{
    void eats();

}

interface Carnivours{
    void eats();

}

class Bear implements Herbivours , Carnivours{
    public void eats(){
        System.out.println("eats grass and meat both");
    }

}

public class Multiple_Inheritance {

    public static void main(String[] args) {
        Bear b = new Bear();
        b.eats();
        
    }
    
}
