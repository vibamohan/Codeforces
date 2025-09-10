import java.util.*;

public class YetAnotherPlussesProblem {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int queries = scanner.nextInt();
    for (int qq = 0; qq < queries; qq++) {
      int n = scanner.nextInt(), m = scanner.nextInt();
      char[][] paint = new char[n][m];

      for (int i = 0; i < n; i++) {
        paint[i] = scanner.next().toCharArray();
      }

      int[] rp = new int[n];
      int[] cp = new int[m];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          if (paint[i][j] == '.') {
            rp[i]++;
            cp[j]++;
          }
        }
      }

      int maxPoss = n + m;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
          maxPoss = Math.min(maxPoss, rp[i] + cp[j] - ((paint[i][j] == '.') ? 1 : 0));
        }
      }

      System.out.println(maxPoss);

    }
  }
}
