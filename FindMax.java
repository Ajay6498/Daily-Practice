import java.util.Collections;
import java.util.Vector;

public class FindMax {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(5);
        v.add(10);
        v.add(2);
        v.add(6);
        v.add(1);
        System.out.println(v);
        int n=Collections.max(v);
        System.out.println(n);

        int index=Collections.binarySearch(v, 6);
        System.out.println(index);

        // while (true) {
        //     System.out.println("Jay Ganesh");
        //     try {
        //         Thread.sleep(2000);
        //     } catch (Exception e) {
        //         // TODO: handle exception
        //     }
            
        // }
    }
}
