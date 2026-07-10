import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashset_it {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("pune");
        cities.add("delhi");
        System.out.println(cities);

        Iterator<String> it=cities.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
