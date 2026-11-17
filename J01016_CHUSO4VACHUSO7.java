
import java.util.Scanner;

public class J01016_CHUSO4VACHUSO7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '4' || s.charAt(i) == '7') {
				++cnt;
			}
		}
		if (cnt != 4 && cnt != 7)
			System.out.println("NO");
		else
			System.out.println("YES");
		sc.close();
	}
}
