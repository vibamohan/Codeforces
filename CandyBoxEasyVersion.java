import java.util.*;

public class CandyBoxEasyVersion {
  public static void solve(int n, int[] arr) {
    int[] count = new int[n + 1];
    for (int i : arr) {
      count[i]++;
    }
    Arrays.sort(count);
    int ans = count[n];
    int maxAllowed = count[n];
    for (int i = n - 1; i >= 0; i--) {
      if (maxAllowed == 0)
        break;
      int pick = Math.min(count[i], maxAllowed - 1);
      if (pick < 0)
        pick = 0;
      ans += pick;
      maxAllowed = pick;
    }
    System.out.println(ans);
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int q = scanner.nextInt();
    while (q-- > 0) {
      int n = scanner.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt();
      }
      solve(n, arr);
    }
    scanner.close();
  }
}
