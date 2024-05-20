package day_520;

import java.util.Scanner;

public class Mini_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        boolean a = checkPassword(password);
        if(a == false){
            System.out.println("Invalid Password");
        }
        else
        {
            System.out.println("Valid Password");
        }
    }

    public static boolean checkPassword(String password) {
        int count = 0;
        int count2 = 0;

        for (int j = 0; j < password.length(); j++)
        {
            if (Character.isLetter(password.charAt(j)) == true){
                count2++;
            }
        }
        if (count2 < 3){
            return false;
        }

        if (password.length() < 10) {
            return false;
        }

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetterOrDigit(password.charAt(i)) == false) {
                return false;
//                System.out.println("false");
            }
//                System.out.println("obfowehfob");
        }

        for (int s = 0; s < password.length(); s++)
        {
            if (Character.isDigit(password.charAt(s)) == true){
                count++;
            }
        }
        if (count < 3){
            return false;
        }

        return true;

//        return valid;

    }
}
//        if(password.length() >= 10){



