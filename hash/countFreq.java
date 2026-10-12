package hash;

import java.util.HashMap;
import java.util.Set;

public class countFreq {
    public static void main(String args[]){
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < arr.length ; i++){
            int num = arr[i];
            if(hm.containsKey(num)){
                hm.put(num,hm.get(num)+1);
            }else{
                hm.put(num, 1);
            }
        }

        for(Integer key : hm.keySet()){
            if(hm.get(key)>arr.length/3){
                System.out.println(key);
            }
        }
    }
}
