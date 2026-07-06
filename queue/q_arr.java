package queue;

public class q_arr {
    static int arr[];
    static int front;
    static int rear;
    static int size;
    Queue(int n){
        arr = new int[n];
        size = n;
        rear = -1;
    }
    public static boolean isEmpty(){
        return rear == -1;
    }

    public static void add(int data){
        if(rear == size-1){
            System.out.println("queue is full");
            return;
        }
        rear = rear++;
        arr[rear] = data;
    }

    public 
}
