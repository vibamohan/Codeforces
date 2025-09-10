import java.util.Arrays;
import java.util.Scanner;

public class BalancedTeam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int balanced = 0;
        int ptr2 = 0;
        for (int i = 0; i < n; i++) {
            while (ptr2 < n && Math.abs(arr[ptr2] - arr[i]) <= 5) {
                ptr2++;
                balanced = Math.max(balanced, ptr2 - i);
            }
        }

        System.out.println(balanced);
    }
}