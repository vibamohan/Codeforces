import java.util.*;

public class OddSumSegments {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int queries = scanner.nextInt();
    for (int qNum = 0; qNum < queries; qNum++) {
      int n = scanner.nextInt(), k = scanner.nextInt();
      int[] nums = new int[n];
      ArrayList<Integer> oddPoss = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        nums[i] = scanner.nextInt();
        if (nums[i] % 2 == 1) {
          oddPoss.add(i);
        }
      }

      if (oddPoss.size() < k || (oddPoss.size() % 2 != k % 2)) {
        System.out.println("NO");
        continue;
      }

      System.out.println("YES");
      for (int i = 0; i < k - 1; i++) {
        System.out.print((oddPoss.get(i) + 1) + " ");
      }
      System.out.println(n);

    }
    scanner.close();
  }
}
