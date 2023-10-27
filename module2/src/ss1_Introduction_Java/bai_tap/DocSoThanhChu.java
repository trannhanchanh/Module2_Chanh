package ss1_Introduction_Java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:");
        String a ="";
        String b ="";
        String c= "";
        String d= "";
        int number = scanner.nextInt();
        if (number < 0 || number > 999) {
            System.out.print("Out of ability");
        } else if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                    a = "Zero";
                    break;
                case 1:
                    a = "One";
                    break;
                case 2:
                    a ="Two";
                    break;
                case 3:
                    a = "Three";
                    break;
                case 4:
                    a = "Four";
                    break;
                case 5:
                    a = "Five";
                    break;
                case 6:
                    a = "Six";
                    break;
                case 7:
                    a = "Seven";
                    break;
                case 8:
                    a = "Eight";
                    break;
                case 9:
                    a = "Nine";
                    break;
            }
            System.out.println(a);
        } else if(number >=10 && number <20){
            int ones= number % 10;
            switch (ones) {
                case 0:
                    a = "Ten";
                    break;
                case 1:
                    a = "Eleven";
                    break;
                case 2:
                    a = "Twelve";
                    break;
                case 3:
                    a = "Thirteen";
                    break;
                case 4:
                    a = "Fourteen";
                    break;
                case 5:
                    a = "Fifteen";
                    break;
                case 6:
                    a = "Sixteen";
                    break;
                case 7:
                    a = "Seventeen";
                    break;
                case 8:
                    a = "Eighteen";
                    break;
                case 9:
                    a = "Nineteeen";
                    break;
            }
            System.out.println(a);
        } else if(number >=20 && number <100){
            int two = number /10;
            int ones= number % 10;
            switch (two){
                case 2:
                    b = "Twenty";
                    break;
                case 3:
                    b = "Thirty";
                    break;
                case 4:
                    b = "Forty";
                    break;
                case 5:
                    b = "Fifty";
                    break;
                case 6:
                    b = "Sixty";
                    break;
                case 7:
                    b = "Seventy";
                    break;
                case 8:
                    b = "Eighty";
                    break;
                case 9:
                    b = "Ninety";
                    break;
            }
            switch(ones){
                case 1:
                    a="one";
                    break;
                case 2:
                    a = "two";
                    break;
                case 3:
                    a = "three";
                    break;
                case 4:
                    a = "four";
                    break;
                case 5:
                    a = "five";
                    break;
                case 6:
                    a = "six";
                    break;
                case 7:
                    a = "seven";
                    break;
                case 8:
                    a = "eight";
                    break;
                case 9:
                    a = "nine";
                    break;
            }
            System.out.print(b+a);
        } else {
            int three = number/100;
            int twoones = number%100;
                switch (three) {
                    case 1:
                        c = "Onehundred";
                        break;
                    case 2:
                        c = "Twohundred";
                        break;
                    case 3:
                        c = "Threehundred";
                        break;
                    case 4:
                        c = "Fourhundred";
                        break;
                    case 5:
                        c = "Fivehundred";
                        break;
                    case 6:
                        c = "Sixhundred";
                        break;
                    case 7:
                        c = "Sevenhundred";
                        break;
                    case 8:
                        c = "Eighthundred";
                        break;
                    case 9:
                        c = "Ninehundred";
                        break;
                }
                if(twoones ==0) {
                    System.out.println(c);
                }


            if(twoones>0 && twoones<10){
                switch (twoones) {
                    case 1:
                        d= "one";
                        break;
                    case 2:
                        d= "two";
                        break;
                    case 3:
                        d = "three";
                        break;
                    case 4:
                        d = "four";
                        break;
                    case 5:
                        d = "five";
                        break;
                    case 6:
                        d = "six";
                        break;
                    case 7:
                        d = "seven";
                        break;
                    case 8:
                        d = "eight";
                        break;
                    case 9:
                        d = "nine";
                        break;


                }
                System.out.println(c+d);
            }
            if(twoones>=10 && twoones<20){
                int ones = twoones %10;
                switch (ones) {
                    case 0:
                        d = "ten";
                        break;
                    case 1:
                        d = "eleven";
                        break;
                    case 2:
                        d = "twelve";
                        break;
                    case 3:
                        d = "thirteen";
                        break;
                    case 4:
                        d = "fourteen";
                        break;
                    case 5:
                        d = "fifteen";
                        break;
                    case 6:
                        d = "sixteen";
                        break;
                    case 7:
                        d = "seventeen";
                        break;
                    case 8:
                        d = "eighteen";
                        break;
                    case 9:
                        d = "nineteen";
                        break;

                }
                System.out.println(c+d);
            }
            if(twoones>=20 && twoones<100){
                int two = twoones /10;
                int ones = twoones % 10;
                switch (two){
                    case 2:
                        b = "twenty";
                        break;
                    case 3:
                        b = "thirty";
                        break;
                    case 4:
                        b = "forty";
                        break;
                    case 5:
                        b = "fifty";
                        break;
                    case 6:
                        b = "sixty";
                        break;
                    case 7:
                        b = "seventy";
                        break;
                    case 8:
                        b = "eighty";
                        break;
                    case 9:
                        b = "ninety";
                        break;
                }
                switch(ones){
                    case 1:
                        a="one";
                        break;
                    case 2:
                        a = "two";
                        break;
                    case 3:
                        a = "three";
                        break;
                    case 4:
                        a = "four";
                        break;
                    case 5:
                        a = "five";
                        break;
                    case 6:
                        a = "six";
                        break;
                    case 7:
                        a = "seven";
                        break;
                    case 8:
                        a = "eight";
                        break;
                    case 9:
                        a = "nine";
                        break;
                }
                System.out.println(c+b+a);

            }

        }

    }
}
