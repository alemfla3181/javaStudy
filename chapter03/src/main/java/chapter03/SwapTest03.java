package chapter03;

public class SwapTest03 {

	public static void main(String[] args) {
		Value a = new Value(10);
		Value b = new Value(20);
		System.out.println(a.val + ":" + b.val);

		swap(a, b);

		System.out.println(a.val + ":" + b.val);

	}

	// swap
	public static void swap(Value p, Value q) {
		int tmp = p.val;
		p.val = q.val;
		q.val = tmp;
	}

}
