package OOP_PTIT;

import java.util.Scanner;

public class J01010_CATDOI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String a = "234567";
		while (t-- > 0) {
			char[] s = sc.next().toCharArray();
			Boolean check = false;
			for (int i = 0; i < s.length; i++) {
				if (a.contains(String.valueOf(s[i]))) {
					check = true;
					break;
				}
				if (s[i] == '8' || s[i] == '9')
					s[i] = '0';
			}

			if (check)
				System.out.println("INVALID");
			else {
				String res = new String(s);

				res = res.replaceFirst("^0+", "");
				if (res.isEmpty())
					System.out.println("INVALID");
				else
					System.out.println(res);
			}
		}
	}
}
