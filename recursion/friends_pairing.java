package recursion;

public class friends_pairing {
    public static int friendsPairing(int n){
        if (n == 1 || n ==2 ){
            return n;
        }
        int fs = friendsPairing(n-1);
        int fp = friendsPairing(n-2);
        int pairways = (n-1)  * fp ;

        int totways = fs + pairways;
        return totways;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(friendsPairing(n));
    }
}
