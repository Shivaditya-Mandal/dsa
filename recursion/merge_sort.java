package recursion;

public class merge_sort {

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");   // print instead of println
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // Left Half
        mergeSort(arr, si, mid);

        // Right Half
        mergeSort(arr, mid + 1, ei);

        // Merge Both Halves
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];

        int i = si;       // Left pointer
        int j = mid + 1;  // Right pointer
        int k = 0;        // Temp pointer

        // Compare elements from both halves
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left half
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right half
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp back into original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {

        int arr[] = {6, 3, 9, 5, 2, 8};

        System.out.println("Before Sorting:");
        printarr(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        printarr(arr);
    }
}