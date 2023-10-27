package ss1_Introduction_Java.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the money(USD):");
        usd = scanner.nextDouble();
        double change = usd * vnd;
        System.out.println("Số tiền là:"+ change);

    }

}
