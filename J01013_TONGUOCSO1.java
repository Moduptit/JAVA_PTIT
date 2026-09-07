package OOP_PTIT;

import java.util.Scanner;

public class J01013_TONGUOCSO1 {
	public static int[] eratosthenes(int n) {
		int[] spf = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			spf[i] = i;
		}
		for (int i = 2; i * i <= n; i++) {
			if (spf[i] == i) {
				for (int j = i * i; j <= n; j += i) {
					if (spf[j] == j) {
						spf[j] = i;
					}
				}
			}
		}
		return spf;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int MAX = 2_000_000;
		int[] spf = eratosthenes(MAX);
		int N = sc.nextInt();
		long sum = 0;
		while (N-- > 0) {
			int x = sc.nextInt();
			while (x > 1) {
				sum += spf[x];
				x /= spf[x];
			}
		}
		System.out.println(sum);
	}
}