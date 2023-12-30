import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
    public static void main(String[] args) {
        String s = "Ajay";
        s = s.toUpperCase();
        char[] ch = s.toCharArray();
        s = s.toUpperCase();
        Set<Character> hs = new HashSet<>();
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    System.out.print("\n" + ch[i] + " ");

                }

            } 

        }
    }
}
