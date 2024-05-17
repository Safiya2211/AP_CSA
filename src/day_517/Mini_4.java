package day_517;

import java.util.Scanner;

public class Mini_4 {
    public static void main(String[] args) {
        int min = 0;
//        int gcd = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if (num1 < num2) {
            min = num1;
        } else if (num1 > num2) {
            min = num2;
        } else {
            System.out.println("GCD is " + num1);
        }


        for(int i = min; i > 0; i--){
//            System.out.println(i);

            if(num1 % i == 0 && num2 % i == 0){
                System.out.println("GCD is " +i);
//                gcd = i;
                break;
            }


//            System.out.println(gcd);
        }



    }

}