package ss2_Vonglap_Java.bai_tap;

import java.util.Scanner;

public class Hienthisonguyento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbers= 20;
        int count = 0;
        int N = 2;
        while (count< numbers){
            if(isPrime(N)){
                System.out.println(N+"");
                count++;

            }
            N++;

        }
        input.close();

    }
    public static boolean isPrime(int number) {
        if(number <=1){
            return false;
        }
        for(int i=2; i<= Math.sqrt(number); i++) {
            if(number % i ==0) {
                return false;
            }
        }
        return true;
    }
}
