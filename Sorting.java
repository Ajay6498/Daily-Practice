import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Sorting {
    public static void main(String[] args) {

        List<Student> ar = new ArrayList<Student>();
        ar.add(new Student(11, "Sam"));
        ar.add(new Student(15, "Ram"));
        ar.add(new Student(1, "Fam"));
        ar.add(new Student(64, "Mam"));
        ar.add(new Student(8, "KHam"));
        ar.add(new Student(6, "Bam"));
        ar.add(new Student(64, "Mam"));

        System.out.println(ar);

        Collections.sort(ar, Comparator.comparing(Student::getName));

        System.out.println(ar);

         Set<Integer> set=new HashSet<>();
         set.add(1);
         set.add(6);set.add(22);set.add(15);
         TreeSet<Integer> ts=new TreeSet<>();
         ts.addAll(set);
         System.out.println(ts);


         int[] arr={2,6,8,2,5,52,41,1};
         System.out.println(Arrays.toString(arr));
         Arrays.sort(arr);
         System.out.println(Arrays.toString(arr));

    }
}

class Student {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }

}
