package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		/* 코드 작성 */
		System.out.print("금액: ");
		int num = scanner.nextInt();
		for (int i = 0; i < MONEYS.length; i++) {
			if (num / MONEYS[i] >= 1) {
				int a = num / MONEYS[i];
				num -= (MONEYS[i] * a);
				System.out.print(MONEYS[i] + "원 :" + a + "개");
				System.out.println();
			}
		}
		scanner.close();
	}
}