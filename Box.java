import java.util.*;

public class Box {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int testCases = scanner.nextInt();
    for (int testNum = 0; testNum < testCases; testNum++) {
      int n = scanner.nextInt();
      int[] q = new int[n];
      int[] p = new int[n];

      TreeSet<Integer> available = new TreeSet<>();

      for (int i = 0; i < n; i++) {
        q[i] = scanner.nextInt();
        available.add(i + 1);
      }

      boolean canMakeP = true;
      for (int i = 0; i < n; i++) {
        if (i == 0 || q[i] > q[i - 1]) {
          if (!available.contains(q[i])) {
            canMakeP = false;
            break;
          } else {
            p[i] = q[i];
            available.remove(p[i]);
          }
        } else {
          Integer num = available.lower(q[i]);
          if (num == null) {
            canMakeP = false;
            break;
          } else {
            p[i] = num;
            available.remove(p[i]);
          }
        }
      }

      if (!canMakeP) {
        System.out.println(-1);
      } else {
        for (int x : p)
          System.out.print(x + " ");
        System.out.println();
      }

    }

    scanner.close();
  }
}
