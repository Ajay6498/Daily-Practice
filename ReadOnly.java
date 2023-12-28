import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnly {
    public static void main(String[] args) {
        List<Integer> ll =  new ArrayList<>();
        ll.add(500);
        ll.add(100);
        ll.add(200);

        System.out.println(ll);

        ll=Collections.unmodifiableList(ll);
        ll.add(300);

        System.out.println(ll);
    }
}
