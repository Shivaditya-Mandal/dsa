package recursion;

public class lastOccurence {
    public static int last_occ(int arr[],int key , int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = last_occ(arr, key, i+1);
        if(isfound == -1 && arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main(String args[]){
        int n = 0; 
        int key = 5;
        int arr[] = {1,2,3,4,5,3,2,46,5,7};
        System.out.println(last_occ(arr,key,n));
    }
}
