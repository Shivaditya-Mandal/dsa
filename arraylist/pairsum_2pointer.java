package arraylist;

import java.util.ArrayList;

public class pairsum_2pointer {
    public static boolean pairSum_2(ArrayList<Integer> list, int target){
        int rp = 0;
        int lp = list.size()-1;
        while(rp<=lp){
            if(list.get(rp)+list.get(lp)==target){
                return true;
            }else if((list.get(rp)+list.get(lp)>target)){
                lp--;
            }else{
                rp++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 22;
        System.out.println(pairSum_2(list, target));
    }
}
