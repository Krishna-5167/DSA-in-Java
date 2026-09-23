abstract class Animal{
    String color;

    Animal(){
        System.out.println("animal constructor called");
    }

}

class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor called");
    }
   
}

class Mustang extends Horse{

    Mustang(){
        System.out.println("mustang constructor called");
    }

}




public class Abstraction_classes {

    public static void main(String[] args) {
        Mustang m = new Mustang();
    }
    
}


