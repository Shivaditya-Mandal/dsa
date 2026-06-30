package recursion;

public class tower_of_hanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {

        // 2
        if (n == 1) {

            // 3
            System.out.println("Move disk " + n + " from " + src + " to " + dest);

            // 4
            return;
        }

        // 5
        // Move top n-1 disks from src to helper using dest
        towerOfHanoi(n - 1, src, dest, helper);

        // 6
        // Move the largest disk from src to dest
        System.out.println("Move disk " + n + " from " + src + " to " + dest);

        // 7
        // Move n-1 disks from helper to dest using src
        towerOfHanoi(n - 1, helper, src, dest);

        // 8
        return;
    }

    // 9
    public static void main(String[] args) {

        // 10
        towerOfHanoi(3, "A", "B", "C");
    }
}
