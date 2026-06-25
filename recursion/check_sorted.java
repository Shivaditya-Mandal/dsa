package recursion;
public class check_sorted {
    public static boolean checkSorted(int arr[] , int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return checkSorted(arr, i+1);
    }
    public static void main(String args[]){
        int n = 0; 
        int arr[] = {1,2,3,4,5};
        System.out.println(checkSorted(arr, n));
    }
}
