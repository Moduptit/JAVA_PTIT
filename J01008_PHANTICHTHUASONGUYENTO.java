package OOP_PTIT;

import java.util.Scanner;

public class J01008_PHANTICHTHUASONGUYENTO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int x = 1; x <= t; x++) {
			System.out.print("Test " + x + ": ");
			int n = sc.nextInt();
			int origin = n;
			for (int i = 2; i <= Math.sqrt(origin); i++) {
				int mu = 0;
				while (n % i == 0) {
					n /= i;
					++mu;
				}
				if (mu != 0) {
					System.out.print(i + "(" + mu + ") ");
				}
			}
			if (n > 1)
				System.out.print(n + "(1)");
			System.out.println();
		}
	}

}
