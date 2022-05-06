package prob5;

public class MyStack {
	private int top;
	private String stackArray[];

	public MyStack(int num) {
		this.top = -1;
		stackArray = new String[1];
	}

	public int Size() {
		return this.top + 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public void push(String str) {
		if (Size() == stackArray.length)
			resize(2 * stackArray.length);
		stackArray[++top] = str;

	}

	public void resize(int Size) {
		String Newstack[] = new String[Size];
		for (int i = 0; i < stackArray.length; i++) {
			Newstack[i] = stackArray[i];
		}
		stackArray = Newstack;
	}

	public String pop() {
		if (isEmpty()) {
			throw new MyStackException();
		} else {
			return stackArray[top--];
		}
	}
}