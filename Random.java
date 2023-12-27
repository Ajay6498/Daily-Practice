import java.util.*;

public class Random {
    public static void main(String[] args) {

        System.out.println(Math.random());

        /****************************************************************** */

        int max = 100, min = 50;
        System.out.println("Generated numbers are within " + min + " to " + max);
        System.out.println(min + (int) (Math.random() * ((max - min) + 1)));

        /*********************************************************** */

    }

}
