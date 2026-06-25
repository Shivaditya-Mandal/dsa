package recursion;

public class n_sum {
    public static int nsum(int n){
        if(n==1){
            return 1;
        }
        int n_sum = nsum(n-1);
        int ns = n+n_sum;
        return ns;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(nsum(n));
    }
}
