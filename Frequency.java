import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        String s="battery low";
        char[] c=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<c.length;i++) {
            if (map.containsKey(c[i])) {
                map.put(c[i], map.get(c[i]) + 1);
                
            }else{
             map.put(c[i], 1);
            }
            
        }
        System.out.println(map);
    }
}
