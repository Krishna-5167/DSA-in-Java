class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newtip){
        tip = newtip;
    }
}


class Student{
    String name;
    int age;
    float percentage; //cgpa

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }
}



public class Classes_And_Objects {

    public static void main(String[] args) {

        Pen p1 = new Pen(); // created a pen object called p1

        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);

        // p1.setColor("Blue");
        p1.color = "Yellow";
        System.out.println(p1.color);


        



    }

    
}

