package stack;
import java.util.*;
public class push_bottom {
    public static void pushAtBottom(Stack<Integer> s , int n){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, n);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushAtBottom(s, 5);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
}
