
import java.util.Scanner;

public class J02004_MANGDOIXUNG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int s[] = new int[n];
			// nhap:
			for (int i = 0; i < s.length; i++) {
				s[i] = sc.nextInt();
			}
			// solve:
			boolean dp[][] = new boolean[n][n];

			for (int len = 1; len <= n; len++) {
				for (int i = 0; len + i <= n; i++) {
					int j = i + len - 1;

					if (len == 1)
						dp[i][j] = true;
					else if (len == 2)
						dp[i][j] = s[i] == s[j];
					else
						dp[i][j] = s[i] == s[j] && dp[i + 1][j - 1];
				}
			}
			if (dp[0][n - 1])
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}
}
