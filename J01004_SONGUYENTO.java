
import java.util.Scanner;

public class J01004_SONGUYENTO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int s = sc.nextInt();
			boolean check = (s >= 2);
			for (int i = 2; i <= Math.sqrt(s); i++) {
				if (s % i == 0) {
					check = false;
					break;
				}
			}
			if (check)
				System.out.println("YES\n");
			else
				System.out.println("NO\n");
		}
	}
}
