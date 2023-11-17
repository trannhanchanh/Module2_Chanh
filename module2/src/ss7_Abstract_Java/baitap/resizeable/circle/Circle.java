package ss7_Abstract_Java.baitap.resizeable.circle;

import ss7_Abstract_Java.baitap.resizeable.inter.Réizeable;

public class Circle extends Shape  implements Réizeable {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + ", which is a suubclass of" +
                super.toString();
    }

    @Override
    public void resize(double percent) {
       this.setRadius(this.getRadius()*(1+ percent/100));
    }
}
