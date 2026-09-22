class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }

}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}




public class Hierarchial_Inheritance {

    public static void main(String[] args) {
        Fish sw = new Fish();
        sw.eat();
        sw.swim();


        Bird bd = new Bird();
        bd.eat();
        bd.fly();

        
        
        
        
    }

    
}
