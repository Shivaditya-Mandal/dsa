package recursion;

public class firstOccurence {
    public static int first_occ(int arr[],int key , int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first_occ(arr, key, i+1);
    }
    public static void main(String args[]){
        int n = 0; 
        int key = 5;
        int arr[] = {1,2,3,4,5,3,2,46,5,7};
        System.out.println(first_occ(arr,key,n));
    }
}
