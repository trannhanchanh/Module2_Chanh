package ss6_Inheritance_Java.baitap.point;

public class Main {
    public static void main(String[] args) {
         Point point = new Point();
        System.out.println(point);
        point = new Point(1.1f, 4.5f);
        System.out.println(point);
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(1.5f, 6.7f);
        System.out.println(movablePoint);
        movablePoint = new MovablePoint(7.7f, 5.7f, 2.3f, 7.6f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
