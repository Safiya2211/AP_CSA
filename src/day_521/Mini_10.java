package day_521;

import java.lang.Math;

import java.util.ArrayList;
import java.util.Scanner;

public class Mini_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter four numbers: ");
        int[] nums = new int[4];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] num = {1,2,3,4};
        four(nums);

    }

    public static void four(int[] nums) {
        int c = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums.length; k++) {
                for (int j = 0; j < nums.length; j++) {
                    for (int s = 0; s < nums.length; s++) {
                        if (i != j && j != k && i != k && s != i && s != j && s != k) {
                            System.out.print( c + ". ");
                            System.out.print(nums[i]+" "+ nums[j]+" "+nums[k]+" "+nums[s]+"\n");
                            c++;
                        }
                    }
                }
            }
        }


    }
    }

