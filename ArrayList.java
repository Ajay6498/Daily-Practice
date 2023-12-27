import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayList {
    public static void main(String[] args) {
             List<Integer> ll= Arrays.asList(22,34,344,56,65,7);
             System.out.println(ll);

             System.out.println(ll.get(5));//7
              
             System.out.println(ll.size());//6

             System.out.println(ll.isEmpty());//False

             System.out.println( ll.contains(65));//true

             //sort
              System.out.println(ll.stream().sorted().collect(Collectors.toList()));
            //Reverse
              System.out.println(ll.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
              
              ll.sort(Comparator.naturalOrder());
              System.out.println(ll);

              


              

    }
}
