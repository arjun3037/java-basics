package test;

public class ObjectReferenceTest {

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setName("NEW NAME");
        fakeCircle(circle);
        System.out.println("In main method");
        System.out.println(circle.getName());
        System.out.println(circle.getColor());

    }

    public static Circle fakeCircle(Circle circle){
        circle.setName("FAKE NAME");
        circle = new Circle();
        circle.setColor("RED");
        System.out.println("In fake method");
        System.out.println(circle.getName());
        System.out.println(circle.getColor());
        return circle;
    }
}

class Circle {
    String name = "ORIGINAL NAME";
    String color = "BLACK";
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
