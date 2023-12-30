import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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
        String str2 = "ajay";

        String output = Arrays.asList(str2.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());

        System.out.println("Original String : " + str2);
        System.out.println("After removing the duplicates : " + output);

    }
}
