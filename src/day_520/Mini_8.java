package day_520;
import java.lang.Math;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Mini_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        printMatrix(n);

    }

    public static void printMatrix(int n) {
        for (int s = 0; s < n; s++) {
            for (int i = 0; i < n; i++) {

                System.out.print(Math.round(Math.random()) +" ");
            }
            System.out.println();
        }
    }

    }