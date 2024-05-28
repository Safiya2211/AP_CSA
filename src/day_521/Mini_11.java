package day_521;

public class Mini_11 {
    public static void main(String[] args) {
        System.out.println("Dice");


        for (int x = 1; x <= 6; x++) {
            for (int y = 1; y <= 6; y++) {
                for (int z = 1; z <=6; z++) {
                    if (x + y + z == 9) {
                        System.out.println(x+ " " + y + " " + z);

                    }
                }
            }

        }
    }
}

