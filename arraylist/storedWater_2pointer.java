package arraylist;
import java.util.*;
public class storedWater_2pointer {

    public static int storeWater_2p(ArrayList<Integer> list){
        int maxWater= 0;
        int lp = 0;
        int rp = list.size()-1;
        while(lp<rp){
            int h = Math.min(list.get(lp),list.get(rp));
            int w = rp-lp;
            int currWater = h*w;
            maxWater=Math.max(maxWater,currWater);

            if(list.get(lp)<list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(storeWater_2p(list));
    }
}


