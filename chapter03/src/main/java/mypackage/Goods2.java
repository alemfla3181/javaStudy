package mypackage;

public class Goods2 {
	public String name; // 모든 접근 가능
	protected int price; // 자식 접근 가능
	int countStock; // default, 같은 패키지
	private int countSold; // 클래스 내부에서만 접근 가능

	public void m() {
		countSold = 10;
	}
}
