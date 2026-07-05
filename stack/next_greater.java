package stack;
import java.util.*;

public class next_greater {

    public static void nextGreater(int arr[], int nGrt[]) {

        Stack<Integer> s = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--) {

            while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if(s.isEmpty()) {
                nGrt[i] = -1;
            } else {
                nGrt[i] = arr[s.peek()];
            }

            s.push(i);
        }
    }

    public static void main(String[] args) {

        int arr[] = {6,8,0,1,3};
        int nGrt[] = new int[arr.length];

        nextGreater(arr, nGrt);

        for(int x : nGrt) {
            System.out.print(x + " ");
        }
    }
} 