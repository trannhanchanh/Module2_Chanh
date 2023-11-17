package ss7_Abstract_Java.baitap.colorable;

import ss7_Abstract_Java.baitap.colorable.inter.Colorable;
import ss7_Abstract_Java.baitap.colorable.square.Square;

public class Test {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square();
        squares[1] = new Square(4.0);
        squares[2] = new Square("orange", false, 6.0);
        for (Square square: squares) {
            square.howToColor();
            square.getArea();
            if(square instanceof Square) {
                Colorable colorable = (Square) square;
                colorable.howToColor();
               

            }

        }
    }
}
