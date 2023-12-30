import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatee {
    public static void main(String[] args) {
        String s="sumsung is smart phone company";
        System.out.println(s);
         String output=Arrays.asList(s.split("")).stream().distinct().collect(Collectors.joining());
         System.out.println(output);

    }
}
