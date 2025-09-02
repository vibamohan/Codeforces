import java.util.*;

public class CollectingPaks {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numTests = scanner.nextInt();

    mainLoop: for (int testNum = 0; testNum < numTests; testNum++) {
      int n = scanner.nextInt();
      int[][] arr = new int[n][2];
      for (int i = 0; i < n; i++) {
        int a = scanner.nextInt(), b = scanner.nextInt();
        arr[i][0] = a;
        arr[i][1] = b;
      }

      Arrays.sort(arr, Comparator
          .comparingInt((int[] a) -> a[0])
          .thenComparingInt(a -> a[1]));

      int[] cur = { 0, 0 };
      StringBuilder sb = new StringBuilder();

      for (int i = 0; i < n; i++) {
        int rightSteps = arr[i][0] - cur[0];
        int upSteps = arr[i][1] - cur[1];

        if (rightSteps < 0 || upSteps < 0) {
          System.out.println("NO");
          continue mainLoop;
        }

        for (int rs = 0; rs < rightSteps; rs++) {
          sb.append('R');
        }

        for (int us = 0; us < upSteps; us++) {
          sb.append('U');
        }

        cur = arr[i];
      }

      System.out.println("YES");
      System.out.println(sb.toString());
    }

    scanner.close();
  }
}
