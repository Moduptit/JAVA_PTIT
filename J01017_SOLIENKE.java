
import java.util.Scanner;

public class J01017_SOLIENKE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			Boolean check = true;
			for (int i = 0; i < s.length() - 1; i++) {
				if (Math.abs((s.charAt(i) - '0') - (s.charAt(i + 1) - '0')) != 1) {
					check = false;
					break;
				}
			}
			if (check)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}

}
