package ss7_Abstract_Java.baitap.resizeable;

import ss7_Abstract_Java.baitap.resizeable.circle.Circle;
import ss7_Abstract_Java.baitap.resizeable.circle.Rectangle;
import ss7_Abstract_Java.baitap.resizeable.circle.Square;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        System.out.println("This area of circle:" + circle.getArea());
        System.out.println("This perimeter of circle:" + circle.getPerimeter());
        circle =new Circle("yellow", true, 5.0);
        System.out.println(circle);
        System.out.println("This area of circle:" + circle.getArea());
        System.out.println("This perimeter of circle:" + circle.getPerimeter());
        circle.resize(50.0);
        System.out.println(circle);
        System.out.println("This area of circle:"+ circle.getArea());
        System.out.println("This perimeter of circle:" + circle.getPerimeter());

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(3.0, 5.0);
        System.out.println(rectangle);
        System.out.println("This area of rectangle:" + rectangle.getArea());
        System.out.println("This perimeter of rectangle:" + rectangle.getPerimeter());
        rectangle = new Rectangle("orange", false, 5.0, 7.0);
        System.out.println(rectangle);
        System.out.println("This area of rectangle:" + rectangle.getArea());
        System.out.println("This perimeter of rectangle:" + rectangle.getPerimeter());
        rectangle.resize(50.0);
        System.out.println(rectangle);
        System.out.println("This area of rectangle:" + rectangle.getArea());
        System.out.println("This perimeter of rectangle:" + rectangle.getPerimeter());

        Square square = new Square();
        System.out.println(square);
        square = new Square(4.0);
        System.out.println(square);
        System.out.println("This area of square:" + square.getArea());
        System.out.println("This perimeter of square:" + square.getPerimeter());
        square = new Square("black", true, 4.0);
        System.out.println(square);
        System.out.println("This area of square:" + square.getArea());
        System.out.println("This perimeter of square:" + square.getPerimeter());
        square.resize(50.0);
        System.out.println(square);
        System.out.println("This area of square:" + square.getArea());
        System.out.println("This perimeter of square:" + square.getPerimeter());

    }
}
