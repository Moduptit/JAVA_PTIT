
import java.util.Scanner;

public class J01014_UOCSONGUYENTOLONNHAT {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			long maxP = 1;
			for (long i = 2; i <= n / i; i++) {
				while (n % i == 0) {
					maxP = i;
					n /= i;
				}
			}
			if (n > 1)
				maxP = n;
			System.out.println(maxP);
		}

	}
}