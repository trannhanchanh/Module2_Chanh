package ss3_Mang_Java.baitap;

import java.util.Scanner;

public class Tongduongcheomatran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int [] [] matrix;
        System.out.println("Enter the size:");
        size = scanner.nextInt();
        matrix = new int[size][size];
        for(int i = 0; i< matrix.length; i++) {
            for(int j = 0; j< matrix[i].length; j++) {
                System.out.println("Enter element "+ "[ "+i + "] ["+ j + "]");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng ban đầu là:");
        for(int i = 0; i< matrix.length; i++) {
            for(int j = 0; j<matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i< matrix.length; i++) {
            for(int j = 0; j< matrix[i].length; j++) {
                if(i == j) {
                    sum1 += matrix[i][j];
                }
                if(i + j == size - 1) {
                    sum2 += matrix[i][j];
                }
            }
        }
        System.out.println("Tổng đường chéo thứ nhất của ma trận là:"+ sum1);
        System.out.println("Tổng đường chép thứ hai của ma trận là:"+ sum2);
    }
}
