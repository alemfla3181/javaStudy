package chapter03;

public class SwapTest02 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a + ":" + b);

		swap(a, b);
		System.out.println(a + ":" + b);

	}

	// swap
	public static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}

}