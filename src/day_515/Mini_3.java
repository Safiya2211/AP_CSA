
package day_515;
import java.lang.Math;
public class Mini_3 {
    public static void main(String[] args) {


        System.out.println("Celsius         Fahrenheit    |    Fahrenheit         Celsius");

        double fh = 20.0;
        String space = "               ";
        for(int c = 0; c <= 100; c+=2) {
            if(c>=10){
                space = "              ";

            }

            if(fa(c) >= 100){
                space = "             ";
            }
            if(c>=100){
                space ="            ";
            }


                System.out.print("   "+c + space + fa(c));
                if(fh>=100){
                    space = "             ";
                }


                System.out.println("       |       " + (int) fh + space + Math.round(cel(fh) * 1000.0) / 1000.0);
                fh += 5;
            }






    }
    public static double fa(double ce){
        double fah = ce *9.0/5.0 +32.0;
        return fah;

    }
    public static double cel(double f){
        double cels = (f-32)*5.0/9.0;
        return cels;
    }
    }

