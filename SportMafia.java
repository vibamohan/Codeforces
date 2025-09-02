
import java.util.Scanner;

public class SportMafia {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long n = scanner.nextLong();
    long k = scanner.nextLong();

    long left = -1;
    long right = n + 1;

    while (right - left > 1) {
      long m = (left + right) / 2;
      long candiesPut = (n - m) * (n - m + 1) / 2;
      long candiesLeft = candiesPut - m;

      if (candiesLeft > k) {
        left = m;
      } else {
        right = m;
      }
    }

    System.out.println(right);
    scanner.close();
  }
}
