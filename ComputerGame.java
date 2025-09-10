import java.util.*;

public class ComputerGame {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int q = scanner.nextInt();
    while (q-- > 0) {
      int k = scanner.nextInt(), n = scanner.nextInt(),
          a = scanner.nextInt(), b = scanner.nextInt();
      k -= n * a;
      if (k > 0) {
        System.out.println(n);
      } else {
        k = (-1 * k) + 1;
        int delta = a - b;
        int cancelledTurns = (k + delta - 1) / delta;
        if (cancelledTurns > n) {
          System.out.println(-1);
        } else {
          System.out.println(n - cancelledTurns);
        }
      }
    }
  }
}
