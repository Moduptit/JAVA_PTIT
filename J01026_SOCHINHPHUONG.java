
import java.util.Scanner;

public class J01026_SOCHINHPHUONG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			Boolean check = false;
			int n = sc.nextInt();
			for (int i = 1; i <= n / i; i++) {
				if (n / i == i && n % i == 0)
					check = true;

			}
			if (check)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
