
import java.util.Scanner;

public class J01011_BOISOCHUNGUOCSOCHUNG {
	public static long gcd(long a, long b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long a = sc.nextLong();
			long b = sc.nextLong();

			long g = gcd(a, b);
			System.out.println(a * b / g + " " + g);
		}
		sc.close();
	}
}
