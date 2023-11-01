package ss3_Mang_Java.baitap;

import java.util.Scanner;

public class Tongso1cotxacdinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1;
        int size2;
        int [][] array;
        System.out.println("Enter the size row:");
        size1 = scanner.nextInt();
        System.out.println("Enter the size column:");
        size2 = scanner.nextInt();
        array = new int[size1][size2];
        for(int row = 0; row< array.length; row++) {
            for(int column = 0; column< array[row].length; column++) {
                System.out.println("Enter element "+ "["+ row + "] ["+ column + "]");
                array[row][column] = scanner.nextInt();
            }
        }
        System.out.println("Mảng ban đầu là:");
        for(int row = 0; row<array.length; row++) {
            for(int column = 0; column<array[row].length; column++) {
                System.out.println(array[row][column]);
            }
        }
        int sum = 0;
        for(int row = 0; row < array.length; row++) {
            for(int column = 0; column< array[row].length; column++) {
                if(column == 1) {
                    sum += array[row][1];
                }
            }
        }
        System.out.println("Tổng ở cột 2 là: "+ sum);


    }
}
