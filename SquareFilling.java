import java.util.*;
import java.awt.geom.Point2D;

public class SquareFilling {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();

    int[][] arr = new int[n][m];
    ArrayList<int[]> ops = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            arr[i][j] = scanner.nextInt();
        }
    }

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < m -1 ;j++) {
            if ((arr[i][j] * arr[i+1][j] * arr[i][j+1] * arr[i+1][j+1]) > 0) {
                arr[i][j] = 2; arr[i+1][j] = 2; arr[i][j+1] = 2; arr[i+1][j+1] = 2;
                ops.add( new int[]{i, j});
            }
        }
    }

    int uncovered = 0;
    for (int[] x : arr) {
        for (int y : x) {
            if (y == 1) uncovered++;
        }
    }

    if (uncovered > 0) {
        System.out.println(-1);
    } else {
        System.out.println(ops.size());
        for (int[] i : ops) {
            System.out.println((i[0]+1) + " " + (i[1] + 1));
        }
    }


   } 
}
