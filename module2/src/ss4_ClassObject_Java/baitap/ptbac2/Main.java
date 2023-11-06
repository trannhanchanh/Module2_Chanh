package ss4_ClassObject_Java.baitap.ptbac2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        do {
            System.out.println("Enter a:");
            a = scanner.nextDouble();
        } while (a == 0);
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();
        QuadracticEquation quadracticEquation = new QuadracticEquation(a, b, c);
        if(quadracticEquation.getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm là:"+ quadracticEquation.x1() + "và "+ quadracticEquation.x2() );
        } else if(quadracticEquation.getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép là:"+ quadracticEquation.x());
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }

    }

}
