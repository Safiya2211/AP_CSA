package day_521;

import java.util.Scanner;

public class Mini_12 {
    public static int l = 0;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\tCONSECUTIVE FOURS");

        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();
        int[] values = new int[n];

        System.out.print("Enter the values: ");
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        if(isConsecutiveFour(values)){
            System.out.println("The list has consecutive fours");
        }
        else {
            System.out.println("The list has no consecutive fours");
        }

    }

    public static boolean isConsecutiveFour(int[] values) {
        int count = 0;
        boolean b = false;
        l = values.length;
        for (int i = 0; i < l-1; i++) {
            if (values[i] == values[i + 1]) {
//                System.out.println(count);
                count++;

                if (count == 3){
//                    System.out.println("four");
                    return true;
                }
            } else {
                count = 0;
//                System.out.println("diff");
            }
        }

//        for (int i = 0; i < )

        return false;

    }
}