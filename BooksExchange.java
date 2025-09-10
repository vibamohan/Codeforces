import java.util.ArrayList;
import java.util.*;

public class BooksExchange {
  public static void main(String[] args) {
    // Basic Easy Version brute force -- just simulate definition
    // Scanner scanner = new Scanner(System.in);
    // int queries = scanner.nextInt();
    // for (int queryNum = 0; queryNum < queries; queryNum++) {
    // int n = scanner.nextInt();
    // int[] arr = new int[n];
    // for (int i = 0; i < n; i++) {
    // arr[i] = scanner.nextInt() - 1;
    // }

    // for (int i = 0; i < n; i++) {
    // int turnsAway = 0;
    // int curPos = i;
    // do {
    // turnsAway++;
    // curPos = arr[curPos];
    // } while (curPos != i);
    // System.out.println(turnsAway);
    // }
    // System.out.println();
    // }

    // Optimization: When we calculate for one person we can just calculate the
    // cycle for everyone else
    Scanner scanner = new Scanner(System.in);
    int queries = scanner.nextInt();
    for (int queryNum = 0; queryNum < queries; queryNum++) {
      int n = scanner.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = scanner.nextInt() - 1;
      }

      int[] cycle = new int[n];
      Set<Integer> solved = new HashSet<>();

      for (int i = 0; i < n; i++) {
        if (!solved.contains(i)) {
          List<Integer> curCycle = new ArrayList<>();
          while (!solved.contains(i)) {
            curCycle.add(i);
            solved.add(i);
            i = arr[i];
          }
          for (int ind : curCycle)
            cycle[ind] = curCycle.size();
        }
      }

      for (int i : cycle)
        System.out.print(i + " ");

      System.out.println();
    }
  }
}
