package recursion;

public class tilingProblem {
    public static int tiling(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        // // vertical
        // int fv = tiling(n-2);
        // //horizontal
        // int fh = tiling(n-1);

        // int totways = fh + fv ;
        return tiling(n-1)+tiling(n-2);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tiling(n));
    }
}
