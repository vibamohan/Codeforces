import java.util.*;

public class PlusFromPicture {
  static final int PLUS_MARKER = 'P';

  public static boolean formsPlus(char[][] arr, int cx, int cy) {
    return (arr[cx - 1][cy] == '*' && arr[cx + 1][cy] == '*' &&
        arr[cx][cy - 1] == '*' && arr[cx][cy + 1] == '*');
  }

  public static void dfs(char[][] arr, int cx, int cy) {
    // dfs in all directions
    arr[cx][cy] = PLUS_MARKER;

    for (int d = cx; d < arr.length; d++) {
      arr[d][cy] = PLUS_MARKER;
    }

    for (int u = cx; u >= 0; u--) {
      arr[u][cy] = PLUS_MARKER;
    }

    for (int l = cy; l >= 0; l--) {
      arr[cx][l] = PLUS_MARKER;
    }

    for (int r = cy; r < arr[0].length; r++) {
      arr[cx][r] = PLUS_MARKER;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int h = scanner.nextInt(), w = scanner.nextInt();
    char[][] arr = new char[h][w];
    for (int i = 0; i < h; i++) {
      arr[i] = scanner.next().toCharArray();
    }
    scanner.close();

    for (int cx = 0; cx < h; cx++) {
      for (int cy = 0; cy < w; cy++) {
        if (arr[cx][cy] == '*' && formsPlus(arr, cx, cy)) {
          dfs(arr, cx, cy);

          for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
              if (arr[i][j] == '*') {
                System.out.println("NO");
                return;
              }
            }
          }

          System.out.println("YES");
          return;
        }
      }
    }
  }
}
