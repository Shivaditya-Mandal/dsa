package arraylist;

import java.util.ArrayList;

public class pair_sum_rotated {
    public static boolean pairSum_rotated(ArrayList<Integer> list , int target){
        int pivot = -1;
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i)>list.get(i+1)){
                pivot = i;
                break;
            }
        }
        int lp = pivot+1;
        int rp = pivot;
        while(rp != lp){
            if(list.get(rp)+list.get(lp)==target){
                return true;
            }
            if(list.get(rp)+list.get(lp)<target){
                lp = (lp+1)% list.size();
            }
            if(list.get(rp)+list.get(lp)>target){
                rp = (list.size()+rp-1)%list.size();
            }
        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(pairSum_rotated(list, target));
    }
}
