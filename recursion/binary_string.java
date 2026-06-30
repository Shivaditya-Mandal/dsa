package recursion;

public class binary_string {
    public static void printBinString(int n, int lastPlace, String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinString(n-1,1 , str+"1");
        if(lastPlace == 1){
            printBinString(n-1, 0, str+"0");
        }

    }
    public static void main(String args[]){
        printBinString(3, 1,"");
    }
}
