package ss6_Inheritance_Java.baitap.point2D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D = new Point2D(1.5f, 4.5f);
        System.out.println(point2D);
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D = new Point3D(6.7f);
        System.out.println(point3D);
        point3D = new Point3D(1.5f, 4.5f, 6.5f);
        System.out.println(point3D);
    }
}
