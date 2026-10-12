package hash;

import java.util.HashMap;
import java.util.*;
public class validAnagram {
    public static boolean isAnagram(String s , String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character ,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }else{
                hm.put(s.charAt(i),1);
            }
        }
        for(int i = 0 ; i < t.length();i++){
            if(hm.get(t.charAt(i)) != null){
                if(hm.get(t.charAt(i))==1){
                    hm.remove(t.charAt(i));
                }else{
                    hm.put(t.charAt(i),hm.get(t.charAt(i))-1);
                }
            }else{
                return false;
            }
        }

        return hm.isEmpty();
    }
    public static void main(String args[]){
        String s = "race";
        String t = "care";
        
        System.out.println(isAnagram(s, t));

    }
}
