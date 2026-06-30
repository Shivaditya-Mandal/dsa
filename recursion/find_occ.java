package recursion;

public class find_occ {
    public static void allOcc(int key , int arr[] , int i){
        if(i==arr.length){
            return ;
        }
        if(arr[i] == key){
            System.out.println(i+" ");
        }
        allOcc(key , arr, i+1);
    }
    public static void main (String args[]){
        int arr[] = {1,2,3,5,2,4,2,2};
        int key = 2;
        allOcc(key, arr, 0);
        System.out.println();
    }
}
