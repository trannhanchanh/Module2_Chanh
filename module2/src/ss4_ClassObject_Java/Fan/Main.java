package ss4_ClassObject_Java.Fan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10, "yellow");
        Fan fan2 = new Fan(2, false, 5, "blue");
        System.out.println("Fan 1 là:"+fan1.toString());
        System.out.println("Fan 2 là:"+fan2.toString());

    }
}
