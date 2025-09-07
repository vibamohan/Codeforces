import java.util.*;

public class BadPrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tcs = scanner.nextInt();
        for (int tt = 0; tt < tcs; tt++) {
            int totalDays = scanner.nextInt();
            int[] days = new int[totalDays];
            for (int i = 0; i < totalDays; i++) {
                days[i] = scanner.nextInt();
            }

            int badDays = 0;
            int rm = Integer.MAX_VALUE;
            for (int i = totalDays - 1; i >= 0; i--) {
                if (days[i] > rm) badDays++;
                rm = Math.min(days[i], rm);
            }

            System.out.println(badDays);
        }
    }
}
