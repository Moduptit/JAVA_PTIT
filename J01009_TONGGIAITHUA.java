
import java.util.Scanner;

public class J01009_TONGGIAITHUA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long s = 0, sum = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
			s += sum;
		}
		System.out.println(s);
	}
}
