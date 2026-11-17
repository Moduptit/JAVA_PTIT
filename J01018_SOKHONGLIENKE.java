
import java.util.Scanner;

public class J01018_SOKHONGLIENKE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			boolean check = true;
			String s = sc.next();
			long sum = 0;
			for (int i = 0; i < s.length(); i++) {

				sum += s.charAt(i) - '0';

				if (i > 0) {
					if (Math.abs((s.charAt(i) - '0') - (s.charAt(i - 1) - '0')) != 2) {
						check = false;
						break;
					}
				}
			}

			if (sum % 10 == 0 && check)
				System.out.println("YES");
			else
				System.out.println("NO");

		}
		sc.close();
	}
}
