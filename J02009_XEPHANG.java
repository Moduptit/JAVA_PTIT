
import java.util.Arrays;
import java.util.Scanner;

public class J02009_XEPHANG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] a = new int[n][2];
		for (int i = 0; i < n; i++) {
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		Arrays.sort(a, (x, y) -> Integer.compare(x[0], y[0]));
		int cur = 0;
		for (int i = 0; i < n; i++) {
			cur = Math.max(cur, a[i][0]) + a[i][1];
		}
		System.out.println(cur);
		sc.close();
	}
}
