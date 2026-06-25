package array;

public class maxSumSubarr_kadanse {
    public static void kadanse(int numbers[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i  = 0 ; i<numbers.length ; i++){
            currSum += numbers[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum , maxSum);
        }
        System.out.println("max sum of a subarray is :" + maxSum);
    }

    public static void main(String args[]){
        int numbers[] = {-2 , -3 , 4 , -1 , -2 , 1 , 5 , -3};
        kadanse(numbers);
    }
}

