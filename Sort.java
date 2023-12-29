import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sort {
    public static void main(String[] args) {
        List<Employee> ll = new ArrayList<>();
        ll.add(new Employee(101, "Ajay", "bb"));

        ll.add(new Employee(103, "Jay", "bb"));
        ll.add(new Employee(105, "Yash", "zb"));
        ll.add(new Employee(108, "Bikas", "bu"));

        System.out.println(ll);

        Collections.sort(ll, Comparator.comparing(Employee::getName));

        System.out.println(ll);

        Set<Employee> tset = new TreeSet<>();
        tset.add(new Employee(101, "Ajay", "bb"));
        tset.add(new Employee(103, "Jay", "bb"));
        tset.add(new Employee(105, "Yash", "zb"));
        tset.add(new Employee(108, "Bikas", "bu"));

        System.out.println("set" + tset);

        Set<Employee> tset2 = new TreeSet<>(ll);
        System.out.println("tset2" + tset2);
        

    }
}

/**
 * InnerSort
 */
class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String lname;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {

        // return "id" + id + "name" +name + "lname" + lname;
        return "\n Employee [id=" + id + ", name=" + name + ", lname=" + lname + "]";
    }

    public Employee(int id, String name, String lname) {
        this.id = id;
        this.name = name;
        this.lname = lname;

    }

    @Override
    public int compareTo(Employee o) {
        // TODO Auto-generated method stub

        return this.name.compareTo(o.name);
    }

}
