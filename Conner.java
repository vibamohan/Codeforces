import java.util.HashSet;
import java.util.Scanner;

public class Conner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ttt = scanner.nextInt();
        mainLoop:
        for (int tt = 0; tt < ttt; tt++) {
            int n = scanner.nextInt();
            int curFloor = scanner.nextInt();
            int unavailable = scanner.nextInt();
            HashSet<Integer> closed = new HashSet<>();
            for (int i = 0; i < unavailable; i++) {
                int cl = scanner.nextInt();
                closed.add(cl);
            }
            for (int diff = 0; ; diff++) {
                if (curFloor - diff >= 1 && !closed.contains(curFloor - diff)) {
                    System.out.println(diff);
                    continue mainLoop;
                }
                if (curFloor + diff <= n && !closed.contains(curFloor + diff)) {
                    System.out.println(diff);
                    continue mainLoop;
                }
            }
        }
    }
}
