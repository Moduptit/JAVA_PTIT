package OOP_PTIT;

import java.util.Scanner;

public class J01007_KIEMTRAFIBO {
	public static void main(String[] args) {
		long[] f = new long[93];
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i <= 92; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextInt();
			boolean check = false;
			for (int i = 0; i <= 92; i++) {
				if (f[i] == n) {
					check = true;
					break;
				}
				if (f[i] > n)
					break;
			}
			if (check)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
