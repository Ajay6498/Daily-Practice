import java.util.*;
import java.util.ArrayList;
import java.util.function.IntFunction;

public class Linklist {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(33);
        ll.add(55);
        ll.add(22);

        System.out.println(ll);
        Collections.sort(ll);
        ll.clear();
        System.out.println(ll);

        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(1);
        list.add(51);
        list.add(12);
        list.add(61);
        list.add(18);

        Integer[] arr=list.toArray( new Integer[0]);  

        System.out.println(Arrays.toString(arr));
         

    }
}
