package day_517;

public class Mini_5 {
    public static void main(String[] args) {
        int numChars = 10;
        int count = 0;

        for (int i = 33; i <= 126; i++){
            count++;

            if (count % 10 == 0)
                System.out.println((char)i);
            else
                System.out.println((char)i+" ");
        }

        System.out.println();
    }
}
