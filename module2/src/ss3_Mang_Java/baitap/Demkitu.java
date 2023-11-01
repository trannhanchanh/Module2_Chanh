package ss3_Mang_Java.baitap;

import java.util.Scanner;

public class Demkitu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String str = scanner.nextLine();
        System.out.println("Nhập kí tự cần đếm:");
        char Character = scanner.next().charAt(0);
        int count = 0;
        for(int i = 0; i<str.length(); i++) {
            if(str.charAt(i) == Character) {
                count ++;
            }
        }
        System.out.println("Số lần xuất hiện trong chuỗi là:"+Character+ "là:"+count);



    }
}
