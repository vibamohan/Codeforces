import java.util.*;

public class YetAnotherMemeProblem {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int ntcs = scanner.nextInt();
    for (int nt = 0; nt < ntcs; nt++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      int ans = a * (Math.abs(b + 1) - 1);
      System.out.println(ans);
    }
    scanner.close();
  }
}
