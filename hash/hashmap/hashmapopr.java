package hash.hashmap;
import java.util.*;
public class hashmapopr {
    public static void main(String args[]){
        HashMap<String ,Integer> hm = new HashMap<>();

        // put - O(1)
        hm.put("India", 100);
        hm.put("US",50);
        hm.put("China",150);
        System.out.println(hm);

        //get - O(1)
        int population = hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("india"));

        //containsKey - O(1)
        System.out.println(hm.containsKey("India"));//true
        System.out.println(hm.containsKey("Indonesia"));//false

        //remove - O(1)
        System.out.println(hm.remove("US"));
        System.out.println(hm);
        System.out.println(hm.remove("Indonesia")); // null

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        //hm.clear
    }
}
