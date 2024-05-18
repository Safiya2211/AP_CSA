package day_517;

import java.util.Scanner;

public class Mini_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Lines: ");
        int lines = scanner.nextInt();

        for(int s = lines; s > 0; s--) {

            for (int i = lines; i > 1; i--) {
                System.out.print(i+" ");
            }
            for (int j = 1; j <= lines; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
            lines--;
        }



    }
}
