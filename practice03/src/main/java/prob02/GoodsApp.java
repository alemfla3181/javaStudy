package prob02;

import java.util.Scanner;

public class GoodsApp extends Goods {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];
		

		// 상품 입력
		for (int i = 0; i < COUNT_GOODS; i++) {
			goods[i] = new Goods();
			goods[i].setProduct(scanner.next());
			goods[i].setPrice(scanner.nextInt());
			goods[i].setNum(scanner.nextInt());
		}
		// 상품 출
		for (int i = 0; i < COUNT_GOODS; i++)
			System.out.println(
					goods[i].getProduct() + "(가격:" + goods[i].getPrice() + "원)이 " + goods[i].getNum() + "개 입고 되었습니다.");
		// 자원정리
		scanner.close();
	}
}
