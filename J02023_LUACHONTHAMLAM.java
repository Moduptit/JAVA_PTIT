import java.util.*;

public class J02023_LUACHONTHAMLAM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        String st = "";
        String end = "";

        if (s < 1 || s > 9 * n) {
            System.out.printf("-1 -1");
            return;
        }

        // min
        int tmp = s;
        int[] a = new int[n];

        for (int i = n - 1; i > 0; i--) {
            int x = Math.min(9, tmp - 1);
            a[i] = x;
            tmp -= x;
        }
        a[0] = tmp;
        for (int x : a)
            st += x;

        // max
        tmp = s;
        for (int i = 0; i < n; i++) {
            int x = Math.min(9, tmp);
            end += x;
            tmp -= x;
        }

        // checksum
        int sum1 = 0, sum2 = 0;
        for (char x : st.toCharArray()) {
            sum1 += x - '0';
        }
        for (char x : end.toCharArray()) {
            sum2 += x - '0';
        }
        if (sum1 == s && sum2 == s)
            System.out.printf(st + " " + end);
        sc.close();
    }
}