package ss6_Inheritance_Java.baitap.circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(2, "blue");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(3);
        System.out.println(cylinder);
        cylinder = new Cylinder(3, "orange" , 2.5);
        System.out.println(cylinder);

    }
}
