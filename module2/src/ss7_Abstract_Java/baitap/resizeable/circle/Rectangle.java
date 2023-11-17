package ss7_Abstract_Java.baitap.resizeable.circle;

import ss7_Abstract_Java.baitap.resizeable.inter.Réizeable;

public class Rectangle extends Shape implements Réizeable {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height + " , which is a subclass of" +
                super.toString();
    }

    @Override
    public void resize(double percent) {
         this.setWidth(this.getWidth() * (1+ percent/100));
         this.setHeight(this.getHeight() * (1+ percent/100));
    }
}
