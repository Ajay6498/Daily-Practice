import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {

    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "sanju");
        hm.put(6, "tanju");
        hm.put(2, "sanju");
        hm.put(3, "manju");
        hm.put(4, "ranju");
        hm.put(5, "ganju");

        System.out.println(hm);

         for (Map.Entry<Integer, String> i : hm.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
         }

 
    }
}