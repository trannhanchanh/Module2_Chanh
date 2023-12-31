package ss7_Abstract_Java.baitap.resizeable.circle;

import ss7_Abstract_Java.baitap.resizeable.inter.Réizeable;

public class Square extends Shape implements Réizeable {
    private double size = 1.0;

    public Square() {
    }

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public  double getArea() {
        return Math.pow(this.size, 2);
    }
    public  double getPerimeter() {
        return 4 * this.size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size + " , which is a subclass of" +
                super.toString();
    }

    @Override
    public void resize(double percent) {
        this.setSize(this.getSize() * (1 + percent/100));

    }
}
