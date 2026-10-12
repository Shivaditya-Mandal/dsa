package hash.hashset;
import java.util.*;
public class hashIterators {
    public static void main(String args[]){
        HashSet<String> cities =  new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("kolkata");
        cities.add("bengaluru");

        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
