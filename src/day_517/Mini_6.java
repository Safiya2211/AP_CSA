package day_517;

import java.util.Scanner;

public class Mini_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("[FACTORS]");

        System.out.print("Enter Integer: ");
        int num = scanner.nextInt();

        System.out.print("Factors of " + num +" --> ");



        for (int i = 1; i <= num; i++){
            if(num % i == 0) {
                    System.out.print(i+"  ");
            }
        }




    }
}
