import java.util.HashSet;
import java.util.Set;
public class hashset {
    public static void main(String[] args){
        Set <String> cities =new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("pune");
        cities.add("delhi");
        System.out.println(cities);

        for(String city:cities){
            System.out.println("city name :"+city);
        }
    }
}
