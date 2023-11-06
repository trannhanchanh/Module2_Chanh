package ss4_ClassObject_Java.StopWatch;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Nhập số phần ử trong mảng:");
        int n = Integer.parseInt(scanner.nextLine());
        int[] array = new int[n];
        for(int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        StopWatch test = new StopWatch();
        test.setStartTime();
        for(int i = 0; i< array.length; i++) {
            for(int j = i+1; j< array.length; j++) {
                if(array[i]> array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        test.setEndTime();
        System.out.println("Thời gian thực thi là:"+ test.getElapsedTime());

    }
}
