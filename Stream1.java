import java.util.Arrays;
import java.util.List;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);

        list.stream().filter(t->t%2==0).forEach(t->System.out.println(t));
    }
}
