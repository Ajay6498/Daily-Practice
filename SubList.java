import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubList {
    public static void main(String[] args) {
        List<Integer> ll= Arrays.asList(22,34,344,56,65,7);
             System.out.println("list: "+ll);
             List<Integer> l=ll.subList(1, 4);
             System.out.println("sub list: "+l);

             System.out.println(ll);
             Collections.rotate(ll, 3);
             System.out.println(ll);
    }
}
