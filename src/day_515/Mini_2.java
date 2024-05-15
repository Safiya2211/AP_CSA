package day_515;

public class Mini_2 {
    public static void main(String[] args) {
        System.out.println("  Inches         Centimeters");
        double in = 1;
        double c = 1;
        String s = "              ";
        for(int i = 1; i <= 10;i++){
            if(i==10){
                s="             ";
            }
            c=i*2.54;
            System.out.println("\t"+i + s + c );

        }
    }
}
