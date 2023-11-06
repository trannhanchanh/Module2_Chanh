package ss4_ClassObject_Java.baitap.ptbac2;

public class QuadracticEquation {
    double a;
    double b;
    double c;

    public QuadracticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }
    public double x1() {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
    public double x2() {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
    public double x() {
        return -b / (2 * a);
    }

}
