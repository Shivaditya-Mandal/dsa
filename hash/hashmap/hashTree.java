package hash.hashmap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class hashTree {
    public static void main(String args[]){
        TreeMap<String , Integer> tm = new TreeMap<>();
        tm.put("india",100);
        tm.put("china",120);
        tm.put("us",80);
        System.out.println(tm);
    }
}
// uses RED BLACK TREEs which is self balancing is a type of bst , it sorts based on keys