package chapter03;

public class StaticMethod {
	int n;
	static int m;

	void f1() {
		// instance 메소드에서는 instance 변수에 접근 가능
		System.out.println(n);
	}

	void f2() {
		// 같은 클래스에서는 클래스(static 변수 접근에서는 클래스 이름 생략 가능)
		// 다른 클래스일 경우 : StaticMethod.m
		System.out.println(m);
	}

	void f3() {
		f2();
	}

	void f4() {
		// 같은 클래스(static 메소드 접근에서는 클래스 이름 생략 가능)
		// 다른 클래스일 경우 : StaticMethod.s1()
		s1();
	}

	static void s1() {
		// static method 에서는 인스턴스 변수 접근 불가
//		System.out.println(n);
	}

	static void s2() {
		System.out.println(StaticMethod.m);
		System.out.println(m);
	}

	static void s3() {
		// static method 에서는 인스턴스 메소드에 접근 불가
		// f1();
	}

	static void s4() {
		// 같은 클래스(static 메소드 접근에서는 클래스 이름 생략 가능)
		StaticMethod.s1();
		s1();
	}
}
