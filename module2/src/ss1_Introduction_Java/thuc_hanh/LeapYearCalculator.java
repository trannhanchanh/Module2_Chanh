package ss1_Introduction_Java.thuc_hanh;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year:");
        year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0) {
                if(year % 400 == 0) {
                    System.out.printf("%d is a leap year ", year);
                } else {
                    System.out.printf("%d is not leap year ", year);
                }

            } else {
                System.out.printf("%d is leap year", year);
            }
        } else {
            System.out.printf("%d is not a leap year", year);
        }
    }
}
