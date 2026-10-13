package hash;
import java.util.*;
public class unionIntersection {
    public static void main(String args[]){
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr1.length ; i++){
            set.add(arr1[i]);
        }
        for(int i = 0 ; i < arr2.length ; i++){
            set.add(arr2[i]);
        }
        System.out.println("the size of union will be : " + set.size());

        set.clear();
        int count = 0 ;
        for(int i = 0 ; i < arr1.length ; i++){
            set.add(arr1[i]);
        }
        for(int i = 0 ; i < arr2.length ; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println("the size of intersection will be :" + count);
    }
}
