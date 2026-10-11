package hash.hashmap;

import java.util.LinkedHashMap;

public class hashLL {
    public static void main(String args[]){
        LinkedHashMap<String , Integer> lhm = new LinkedHashMap<>();
        lhm.put("india",100);
        lhm.put("china",120);
        lhm.put("us",80);
        System.out.println(lhm);
    }
}
// stores the data in a ordered manner rather randomised because it uses a doubly lnked list