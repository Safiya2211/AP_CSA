package day_64;

import java.util.Arrays;
import java.util.Comparator;

public class mini_14 {
    public static void main(String[] args) {
        System.out.println("SORT");
        int[][] nums = {{4,2},{1,7},{4,5},{1,2},{1,1},{4,1}};
        sort(nums);

    }

    public static void sort(int m[][]){
        System.out.print("{");

        for(int i = 0; i< m.length; i++){
            System.out.print("{"+m[i][0] + ", " + m[i][1]+"}");
            if(i < m.length-1){
                System.out.print(",");
            }
        }
        System.out.println("}");

        Comparator<int[]> first = Comparator.comparingInt(x -> x[0]);
        Comparator<int[]> second = Comparator.comparingInt(x -> x[1]);

        Arrays.sort(m, first.thenComparing(second));

        String o = "";
        String t = "";


        for(int i = 0; i< m.length; i++){
            o+= m[i][0] ;
            t += m[i][1];
        }

        System.out.print("{");
        for(int j = o.length(); j > 0; j--) {

            System.out.print("{"+o.substring(j-1,j) +", "+ t.substring(j-1,j) +"}" );
            if(j >1){
                System.out.print(",");
            }
        }
        System.out.print("}");






    }

    }

