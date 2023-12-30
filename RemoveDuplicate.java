import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "samsung";
        char[] ch = str.toCharArray();

        Set<Character> hs = new HashSet<>();

        for (Character character : ch) {
            hs.add(character);
        }
        StringBuilder sb = new StringBuilder();

        for (Character character : hs) {
            sb.append(character);
        }
        System.out.println(sb);
        /* ************************************************************* */

         
    }
}
