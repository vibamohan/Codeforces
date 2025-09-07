import java.util.Scanner;

public class SumOfOddInts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ttt = scanner.nextInt();
        for (int tt = 0; tt < ttt; tt++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            if (k*k <= n && n%2==k%2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
