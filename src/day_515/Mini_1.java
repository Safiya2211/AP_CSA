package day_515;

public class Mini_1 {
    public static void main(String[] args) {
        System.out.println("Celsius         Fahrenheit");
        double c = 0;
        double f = 32;
        for(int i = 0; i <= 50;i++){
                System.out.println(" "+(int) c + "              " + f );

            c+=2;
            f= c*9/5+32;
        }
    }

    }



