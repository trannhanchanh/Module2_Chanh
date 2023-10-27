package ss2_Vonglap_Java.thuc_hanh;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount:");
        money = input.nextDouble();
        System.out.println("Enter number of months");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage:");
        interestRate = input.nextDouble();
        double totalMoney = 0;
        for(int i = 0; i< month; i++){
            totalMoney+= money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of money :"+totalMoney);

    }
}
