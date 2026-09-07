package OOP_PTIT;

import java.util.Scanner;

public class J01002_TINHTONGNSONGUYENDUONGDAUTIEN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			long x = sc.nextInt();
			System.out.println((x + 1) * x / 2 + "\n");
		}
	}
}