import java.util.Scanner;

public class YetAnotherPalindromeProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tcs = scanner.nextInt();
        for (int tt = 0; tt < tcs; tt++) {
            int n = scanner.nextInt();
            int[] arr = new int[n]; 

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            boolean ok = false;
            ol: 
            for (int i = 0; i < n; i++) {
                for (int j = i + 2; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        ok = true; break ol;
                    }
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}
