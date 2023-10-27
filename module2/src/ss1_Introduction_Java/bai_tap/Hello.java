package ss1_Introduction_Java.bai_tap;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter your name:");
        String name= scanner.nextLine();
        System.out.print("Hello:"+ name);
    }
}
