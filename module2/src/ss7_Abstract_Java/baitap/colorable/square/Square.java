package ss7_Abstract_Java.baitap.colorable.square;

import ss7_Abstract_Java.baitap.colorable.inter.Colorable;

public class Square extends Shape implements Colorable {
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
    public double getArea() {
        return Math.pow(this.size, 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "size=" + size + " , which is a subclass of" +
                super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");

    }
}
